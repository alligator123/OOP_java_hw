package java09;

public class CRectangle {
private int width;
private int height;
public CRectangle(int w,int h) { //a
	width=w;
	height=h;
}
public CRectangle() { //c
	this(10,8);
}

void show() {
	System.out.println(width+","+height);
}
	public static void main(String[] args) {
		CRectangle a = new CRectangle(8,10);
		CRectangle b = new CRectangle();
		a.show();
		b.show();
	}

}
