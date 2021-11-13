package java09;

public class Caaa { //c 可以 所有的class都可以存取
	private int value; //d 否 變成所有class都能存取 

	public Caaa() {
		value = 10; //a
		System.out.println("value=" + value);
	}

	public Caaa(int i) {
		value = i;
		System.out.println("value=" + value);
	}

	public static void main(String[] args) {
		Caaa obj1 = new Caaa(); //b Caaa()
		Caaa obj2 = new Caaa(12);//b Caaa(int i)
	}

}
