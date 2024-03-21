package chap03;
import java.util.Scanner;
public class 도전과제3 {
	public static void main(String[] args) {
		int result=1;
		int n;
		
		Scanner in=new Scanner(System.in);
		
		System.out.print("정수 입력:");
		n=in.nextInt();
		
		result=factorial(n);
		System.out.println(factorial(5));
		System.out.println(factorial(1,5));
		System.out.println(factorial(3,5));
		System.out.println(factorial(10,5));
		
	}
	public static int factorial(int x) {
		int r=1;
		
		while (x>0) {
			r *=x;
			x--;
		}
		return r;
	}
	public static int factorial (int x,int y) {
		int r=1;
		
		while (x <=y) {
			r *=x;
			x++;
		}
		return r;
	}

}
