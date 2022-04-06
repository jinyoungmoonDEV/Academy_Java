package Day6;

public class book {

	public static void main(String[] args) {
		Triangle t = new Triangle(10.0, 5.0);
		System.out.println(t.findArea());
	}
}
class Triangle{
	public Triangle(double a, double b) {
		this.a=a;
		this.b=b;
		}
	public static double findArea() {
		return  a*b*0.5;
	}
}
