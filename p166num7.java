package chap04program;
class GolfClub {
	private int n;
	private String name;
	
	public GolfClub(int n) {
		this.n=n;
	}
	public GolfClub(String name) {
		this.name=name;
	}
	GolfClub() {
		n=7;
	}
	public void print() {
		if (n>0) {
			System.out.println(n+"번 아이언입니다");
		}else {
			System.out.println(name+"입니다.");
		}	
	} 
}
public class p166num7 {

	public static void main(String[] args) {
		GolfClub g1= new GolfClub();
		g1.print();
		
		GolfClub g2 = new GolfClub(8);
		g2.print();
		
		GolfClub g3 = new GolfClub("퍼터");
		g3.print();

	}

}
