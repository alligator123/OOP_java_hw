package pack12_5;

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
