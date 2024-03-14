package 과제;

import java.util.Scanner;

public class no3 {
	public static void main(String[] args){
		
		double x,y,z;
		
		Scanner in=new Scanner(System.in);
		
		System.out.print("원기둥의 밑면 반지림은?");
		x=in.nextDouble();
		
		System.out.print("원기둥의 높이는?");
		y=in.nextDouble();
		
		z=x*x*3.14*y;
		
		System.out.println("원기둥의 부피는 "+z);
	}

}
