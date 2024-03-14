package 과제;

import java.util.Scanner;
public class no6 {
	public static void main(String[] args) {
		double F,C;
		
		Scanner in=new Scanner(System.in);
		System.out.print("화씨온도를 입력하세요 :");
		F=in.nextDouble();
		C=(5*(F-32)/9);
		
		System.out.println(C+"도");
	}

}
