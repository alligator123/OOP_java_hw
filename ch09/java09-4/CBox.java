package java09;

class CBox {
	private int length;
	private int width;
	private int height;

	public CBox(int l, int w, int h) {
		length = l;
		width = w;
		height = h;
	}

	public void show() {
		System.out.print("length=" + length);
		System.out.print(",width=" + width);
		System.out.println(",height=" + height);
	}

	public static void main(String[] args) {
		CBox box1 = new CBox(2,3,4); //沒有給定數值
		box1.show();
	}

}
