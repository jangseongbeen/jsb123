package chap03;
import java.util.Scanner;
public class 도전과제2 {
	public static void main(String[] args) {
		int result=1;
		int n;
		
		Scanner in=new Scanner(System.in);
		
		System.out.print("정수 입력:");
		n=in.nextInt();
		
		result=factorial(n);
		System.out.print(result);
		
	}
	public static int factorial(int x) {
		int r=1;
		
		while (x>0) {
			r *=x;
			x--;
		}
		return r;
	}

}
