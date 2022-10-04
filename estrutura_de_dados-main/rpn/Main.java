package rpn;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String posfixa;
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite a expressao: ");
		posfixa = scan.nextLine();
		System.out.println("Resultado: " + Calcular.expressaoPosfixa(posfixa));
			
		scan.close();
	}
}
