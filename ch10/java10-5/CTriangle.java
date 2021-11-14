package homea;

public class CTriangle {
	protected int base;
	protected int height;

	protected void show() {
		System.out.println("base=" + base + ",height=" + height);
	}

	class CData extends CTriangle {
		public CData(int a, int b) {
			base = a;
			height = b;
		}

		public void area() {

			show();
			System.out.println(base * height / 2);
		}
	}

	public static void main(String[] args) {
		CData obj = new CData(3,8);
		obj.area();
	}

}
