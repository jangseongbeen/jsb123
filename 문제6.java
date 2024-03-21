package chap03;
import java.util.Scanner;
public class 문제6 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		String ch,yh;
		
		System.out.print("철수 :");
		ch= in.next();
		
		System.out.print("영희 :");
		yh= in.next();
		
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
