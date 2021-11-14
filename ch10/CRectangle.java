
class CRectangle {
	private int length;
	private int width;
 public CRectangle(){
   length=2;
   width=2;
 }
  public CRectangle(int 1,int w){
   width=w;
 }
}

class CData extends CRectangle {
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
