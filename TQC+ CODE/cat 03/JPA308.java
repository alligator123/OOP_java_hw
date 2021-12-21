import java.util.Scanner;

public class JPA308 {

	public static void main(String[] args) {
		int money,sum=0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("請輸入消費金額，或輸入-1結束:");
			money = sc.nextInt();
			if(money == -1) {
				System.out.println("電腦周邊總消費:"+sum);
				break;
			}
			sum += money;
		} while (true);
	}

}
