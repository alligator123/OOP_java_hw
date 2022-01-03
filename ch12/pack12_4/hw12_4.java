package pack12_4;

public class CWindow{
	private int width;
	private int height;
	private String name;

	public CWindow(int w, int h, String s) {
		width = w;
		height = h;
		name = s;
	}

	public void show() {
		System.out.println("Name=" + name);
		System.out.println("W=" + width + ", H+" + height);
	}
}

public class hw12_4 {

	public static void main(String[] args) {
		CWindow cw = new CWindow(3, 5, "Big windows");
		cw.show();
	}

}
