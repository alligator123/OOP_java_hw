package java10;

public class Caaa {
	private int num;

	public Caaa(int n) {
		num = n;
	}

	public int get() {
		return num;
	}

	class Cbbb extends Caaa {
		public Cbbb(int n) {
			super(n);
		}
		public void show() {
			System.out.println("num=" + get());
		}
	}

	public static void main(String[] args) {
		Cbbb bb = new Cbbb(2);// TODO Auto-generated method stub
		bb.show();
	}

}

