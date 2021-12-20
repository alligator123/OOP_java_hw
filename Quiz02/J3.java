package test2;
interface lArea{
	void area();
}
class Circle implements lArea{
	private double r;
	public Circle(double r) {
		this.r = r;
	}
	public void area() {
		System.out.println("圓形面積:"+3.1416*r*r);
	}
}
class Rectangle implements lArea{
	private double width;
	private double height;
	public Rectangle(double w,double h) {
		width = w;
		height = h;
	}
	public void area() {
		System.out.println("矩形面積:"+width*height);
	}
}
class Triangle implements lArea{
	private double height;
	private double bottom;
	public Triangle(double b,double h) {
		bottom = b;
		height = h;
	}
	public void area() {
		System.out.println("三角形面積:"+bottom*height/2);
	}
}
public class J3 {

	public static void main(String[] args) {
		lArea a;
		Circle c = new Circle(6.0);
		Rectangle r = new Rectangle(10.0,15.0);
		Triangle t = new Triangle(20.0,15.0);
		for(int i=1;i<=3;i++) {
			if(i==1) a=c;
			else if(i==2)a=r;
			else a=t;
				a.area();
		}
	}

}
