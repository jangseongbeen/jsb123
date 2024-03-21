package chap03;

public class 문제8 {
	public static void main(String[]args) {
		System.out.println(factorial(5));
	}
	static int factorial(int n) {
		return switch (n) {
		case 2 -> 2;
		default -> n * factorial(n - 1);
		};
	}
}
