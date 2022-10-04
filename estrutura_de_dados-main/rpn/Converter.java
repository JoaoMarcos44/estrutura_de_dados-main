package rpn;

public class Converter {

  public static Fila paraFila_posfixa(String str) {
    if (str == null)
      return null;
    Fila fila = new Fila();
    int tam = str.length();
    String num = "";
    for (int i = 0; i < tam; i++) {
      char c = str.charAt(i);
      do {
        num += c;
        try {
          c = str.charAt(++i);
        } catch (StringIndexOutOfBoundsException e) {
          break;
        }
      } while (c != ' ');
      fila.push(num);
      num = "";
    }
    return fila;
  }
}
