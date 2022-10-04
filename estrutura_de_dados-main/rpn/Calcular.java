package rpn;


public class Calcular {
  
	public static Object expressaoPosfixa(String expressao) {
		Fila fila = Converter.paraFila_posfixa(expressao);
    
		if(fila==null) return null;
	    Node f = fila.primeiro;
	    Pilha pilha = new Pilha();
	    double n1, n2, res;
	    String calculo="";
	
	    while (f!=null) {
	      if (Check.isOper(f.value)) {
			  String str1 = pilha.primeiro.next.value.replaceAll("," , ".");
	          String str2 = pilha.primeiro.value.replaceAll(",", ".");
			  n1 = Double.parseDouble(str1);
	          n2 = Double.parseDouble(str2);
	        switch (f.value) {
	          case "+":
	            res = n1 + n2;
	            break;        
	          case "-":
	            res = n1 - n2;
	            break; 
	          case "*":
	            res = n1 * n2; 
	            break;
	          case "/":
	            res = n1 / n2;
	            break;
	          default:
	            return "";
	        }
	        pilha.pop(); pilha.pop();
	        pilha.push(String.format("%.2f", res));
	      }else{
	        pilha.push(f.value);
	      }
	      f=f.next;
	    }
	    calculo=pilha.primeiro.value;
		try{
			if(pilha.primeiro.next!= null){
				System.out.println("Possui uma variável armazenada que ainda não foi efetivada");

			}
		}catch (Exception e){
			System.out.println("Em progresso");

		}
	
	    return calculo;
	}
}
