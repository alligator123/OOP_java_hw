import java.util.Scanner;

public class JPA308 {

	public static void main(String[] args) {
		int money,sum=0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("�п�J���O���B�A�ο�J-1����:");
			money = sc.nextInt();
			if(money == -1) {
				System.out.println("�q���P���`���O:"+sum);
				break;
			}
			sum += money;
		} while (true);
	}

}
