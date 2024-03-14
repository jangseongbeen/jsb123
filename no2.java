package 과제;

import java.util.Scanner;

public class no2 {
	public static void main(String[] args) {
		
		int x;
		int y;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 :");
		x=in.nextInt();
		
		y=x*x;
		System.out.println(x+"의 제곱은 "+y);
		
	}

}
