package chap03;
import java.util.Scanner;
public class 문제2 {
	public static void main(String[] args) {
		int x;
		Scanner in=new Scanner(System.in);
		
		System.out.print("등수를 입력하세요 :");
		x=in.nextInt();
		
		switch(x) {
		case 1 ->System.out.print("아주 잘했습니다");
		case 2,3 ->System.out.print("잘했습니다");
		case 4,5,6 ->System.out.print("보통입니다");
		default ->System.out.print("노력해야겠습니다");
		}
		
		
	}

}
