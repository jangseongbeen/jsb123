package chap03;
import java.util.Scanner;
public class 문제7 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		String ch=input("철수");
		String yh=input("영희");
		whosWin(ch,yh);
	}
	
	public static String input(String c) {
		Scanner in = new Scanner(System.in);
		System.out.print(c+" :");
		c=in.next();
		return c;
	}
	public static void whosWin(String ch,String yh) {
		if ((ch.equals("s") && yh.equals("s")) || (ch.equals("r") && yh.equals("r")) ||
		        (ch.equals("p") && yh.equals("p"))) {
		            System.out.println("비겼습니다");
		        }
		        else if ((ch.equals("s") && yh.equals("p")) || (ch.equals("r") && yh.equals("s")) || 
		        (ch.equals("p") && yh.equals("r"))) {
		            System.out.println("철수 승");
		        }
		        else  {
		            System.out.println("영희 승");
		        }
	}

}
