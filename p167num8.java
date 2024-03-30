package chap04program;
class Dice {
	private double face;
	
	public Dice() {
		this.face=face;
	}
	public int roll() {
		this.face=(int)((Math.random() * 10% 6)+1);
				return (int)face;
	}
}

public class p167num8 {

	public static void main(String[] args) {
		Dice d= new Dice();
		System.out.println("주사위의 숫자 :"+ d.roll());
	}

}
