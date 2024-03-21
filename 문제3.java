package chap03;
import java.util.Scanner;
public class 문제3 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x=1;
		int y=0;
		
		do {
			System.out.print("양의 정수를 입력하세요 :");
			x=in.nextInt();
			
			if (x % 2 == 0)
				y+=x;

		} while (x>0);
		System.out.print("입력한 양의 정수중에서 짝수의 합은"+y);
	}

}
