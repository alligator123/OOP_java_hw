package java09;

public class Caaa { //c �i�H �Ҧ���class���i�H�s��
	private int value; //d �_ �ܦ��Ҧ�class����s�� 

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
