package java08;

public class CTest {
	void test(int a) {
		if ((a % 2 == 0)&(a!=0)) {
			System.out.println("���Ƭ�����");
		} else if(a%2!=0){
			System.out.println("���Ƭ��_��");
		}
		if (a == 0) {
			System.out.print("���Ƭ�0");
		}
	}

	public static void main(String[] args) {
		CTest test1 = new CTest();
		test1.test(3);
		test1.test(8);
		test1.test(0);
	}

}
