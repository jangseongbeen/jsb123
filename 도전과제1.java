package chap03;
import java.util.Scanner;
public class 도전과제1 {
	public static void main(String[] args) {
		int result=1;
		int n;
		Scanner in=new Scanner(System.in);
		
		System.out.println("정수를 입럭하시오:");
		n=in.nextInt();
		
		while (n>0) {
			result *=n;
			n--;
		}
		System.out.print(result);
	}

}
