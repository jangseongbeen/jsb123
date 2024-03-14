package 과제;

import java.util.Scanner;

public class no4 {
	public static void main(String[] args) {
		
		int x;
		int h,m,s,q;
		
		Scanner in=new Scanner(System.in);
		
		System.out.print("초 단위 정수를 입력하세요 :");
		x=in.nextInt();
		
		h=x/3600;
		q=x&3600;
		m=q/60;
		s=x%60;
		
		System.out.println(h+"시간"+m+"분"+s+"초");
	}

}
