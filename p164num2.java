package chap04program2;
class triangle {
	private double width;
	private double height;
	
	public triangle (double width, double height) {
		this.width=width;
		this.height=height;
	}
	public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }

	public double findArea() {
        return width * height * 0.5;
    }
	String isSameArea(triangle findArea) {
		if (findArea() == findArea.findArea()) {
			return "동일합니다";
		}else 
			return "동일하지 않습니다";
	}
}
public class p164num2 {
	public static void main(String[] args) {
		triangle t1= new triangle(10.0,5.0);
		triangle t2= new triangle(5.0,10.0);
		triangle t3= new triangle(8.0,8.0);
		
		System.out.println(t1.isSameArea(t2));
		System.out.println(t1.isSameArea(t3));
	}

}
