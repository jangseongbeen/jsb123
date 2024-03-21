package chap03;
import java.util.Scanner;
public class 문제5 {
	public static void main(String[] args) {
		
		for (int a=1;a<20;a++) {
			for (int b=1;b<20;b++) {
				for (int c=1;c<20;c++) {
					if (a+b+c <= 20) {
						if (a*a + b*b ==c*c) {
							System.out.println("각 변의 길이는 "+a+b+c+"이다");
						}
					}
				}
			}
		}
	}
}
