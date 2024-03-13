package 과제;

import java.util.Scanner;

public class 짝수홀수 {
	public static void main(String[] args) {
		
		
		int x;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 :");
		x= in.nextInt();
		
		
		System.out.println((x%2==0 ? "짝수" : "홀수"));
	}

}
