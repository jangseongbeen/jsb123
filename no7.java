package 과제;

import java.util.Scanner;

public class no7 {
	public static void main(String[] args) {
		
		int x;
		
		Scanner in=new Scanner(System.in);
		System.out.print("정수를 입력하시오 :");
		x=in.nextInt();
		
		System.out.println(x%4==0 && x%5==0);
		System.out.println(x%4==0 || x%5==0);
		System.out.println(x%4==0 ^ x%5==0);
	}
	

}
