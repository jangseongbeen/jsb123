package chap0402;

class Printer {
	private int numOfPapers=0;
	
	public Printer (int numOfPapers) {
		this.numOfPapers += numOfPapers;
	}
	
	public void print(int amount) {
		if(numOfPapers > amount) {
			numOfPapers-=amount;
			System.out.println(amount+"장 출력했습니다."+numOfPapers+"장 남았습니다.");
		} 
		 else if (numOfPapers<=0) {
			System.out.println("용지가 없습니다.");
		}
		 else if(numOfPapers<amount) {
				System.out.printf("모두 출력하려면 용지가 %d매 부족합니다. %d장만 출력합니다.\n", (amount-numOfPapers), numOfPapers);
	            numOfPapers -= numOfPapers;
			}
	}
	
}

public class 도전과제2 {
	public static void main(String[] args) {
		Printer P = new Printer(10);
		P.print(2);
		P.print(20);
		P.print(10);
	}

}