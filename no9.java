package 과제;

import java.util.Scanner;

public class no9 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int x,y,z,a,s,d,q;
		
		System.out.print("전공 이수 학점 :");
		x=in.nextInt();
		System.out.print("교양 이수 학점 :");
		y=in.nextInt();
		System.out.print("일반 이수 학점 :");
		z=in.nextInt();
		
		a=(x+y+z>=140) ? 1 : 0;
		s=(x>=70) ? 1 : 0;
		d=((y+z>=80) || ((y>=30)&&(z>=30)) ? 1 : 0);
		q=a+s+d;
		System.out.print(q==3 ? "졸업가능" : "졸업 불가능");
		
	}

}
