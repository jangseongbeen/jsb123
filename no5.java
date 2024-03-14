package 과제;

import java.util.Scanner;

public class no5 {
	public static void main(String[] args) {
		char c;
		Scanner in = new Scanner(System.in);
		System.out.print("알파벳을 입력하세요 :");
		c = in.next().charAt(0);
		int a = (int)'A'-(int)'a';
		char result = (char) ((int) c + a);
		System.out.print(result);
	}

}
