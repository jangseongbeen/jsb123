package chap04program;
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
	
}

public class p164num1 {

	public static void main(String[] args) {
		triangle t = new triangle(10.0,5.0);
		System.out.println(t.findArea());
	}

}
