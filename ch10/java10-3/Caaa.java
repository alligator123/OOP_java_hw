package java10;

class Caaa {
	public int num1;
	public int num2;

	public Caaa() {
		num1 = 1;
		num2 = 1;
	}

	public Caaa(int a, int b) {
		num1 = a;
		num2 = b;
	}
}

class Cbbb extends Caaa {
	public Cbbb() {

	}

	public Cbbb(int a, int b) {
		super(a, b);
	}

	public void show() {
		System.out.println("num1=" + num1);
		System.out.println("num2=" + num2);
	}

	public static void main(String[] args) {
		Cbbb aa = new Cbbb();
		Cbbb bb = new Cbbb(1, 2);
		Cbbb cc = new Cbbb(3, 4);
		aa.show();
		bb.show();
		cc.show();

	}

}