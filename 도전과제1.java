package chap04;
class Printer {
	int numOfPapers=0;
	
	public void print(int amount) {
		System.out.println("출력한 용지:"+amount);
		numOfPapers-=amount;
		System.out.println("남은 용지:"+numOfPapers);
	}
}

public class 도전과제1 {
	public static void main(String[] args) {
		Printer Print = new Printer();
		Print.numOfPapers=100;
		System.out.println("현재 용지 :"+Print.numOfPapers);
		
		Print.print(70);
		
		
	}

}
