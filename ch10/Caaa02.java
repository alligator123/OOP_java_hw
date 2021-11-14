
class Caaa02 {
	private int num1;//宣告成private的成員不能直接在子類別存取，只能透過父類別的函數存取
	private int num2;
}

class Cbbb extends Caaa02 {
	private void set_num(int a, int b) {
		num1 = a;
		num2 = b;
	}

	private void show() {
		System.out.println("num1=" + num1);
		System.out.println("num2=" + num2);
	}

	public static void main(String[] args) {
		Cbbb bb = new Cbbb();
		bb.set_num(5, 10);
		bb.show();
	}

}

