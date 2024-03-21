package chap03;
import java.util.Scanner;
public class 문제1 {
	public static void main(String[] args) {
		int x;
		Scanner in=new Scanner(System.in);
		
		System.out.print("나이를 입력하시오 :");
		x=in.nextInt();
		
		if(x>=19) {
			System.out.print("성년");
		}
		else {
			System.out.print("미성년");
		}
	}

}
