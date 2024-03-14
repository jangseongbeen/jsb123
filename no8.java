package 과제;

import java.util.Scanner;

public class no8 {
	public static void main(String[] args) {
		
		int x,h,t,o,sum;
		
		Scanner in=new Scanner(System.in);
		System.out.print("0부터 999사이의 숫자를 입력하세요 :");
		x=in.nextInt();
		
		h=x/100;
		t=x%100/10;
		o=x%10;
		sum=h+t+o;
		System.out.print(sum);
	}

}
