
class Caaa03{
	public int num1;
	public int num2;
  public Caaa03(){
  num1=1;
  num2=1;
  }
  public Caaa03(int a,int b){
  num1 = a;
  num2 = b;
  }
 
}

class Cbbb extends Caaa {
	private void set_num(int a, int b) {
		num1 = a;
		num2 = b;
    public Cbbb(int a,int b){
   super(a,b)
    }
	}

	private void show() {
		System.out.println("num1=" + num1);
		System.out.println("num2=" + num2);
	}

	public static void main(String[] args) {
		Caaa03 aa = new Caaa03();
    Caaa03 bb = new Caaa03(1,2);
		Cbbb cc = new Cbbb(3,4);
    aa.show();
    bb.show();
    cc.show();
	}

}
