package rpn;

public class Check {
	public static boolean isOper(char c) {
		switch (c) {
			case '+':
			case '-':
			case '*':
			case '/':
				return true;
			default:
				return false;
		}
	}

	public static boolean isOper(String c) {
		switch (c) {
			case "+":
			case "-":
			case "*":
			case "/":
				return true;
			default:
				return false;
		}
	}
}
