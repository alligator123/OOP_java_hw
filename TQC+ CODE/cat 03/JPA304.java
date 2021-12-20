import java.util.Scanner;

public class JPA304 {

	public static void main(String[] args) {
		int money, count = 0, sum = 0;
		double average;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Please enter meal dollars or enter -1 to stop:");
			money = sc.nextInt();
			if (money == -1) {
				System.out.println("餐點總費用:"+sum);
				average = sum/(double)count;
				System.out.printf(count+"道餐點平均費用為:"+"%.2f",average);
				break;
			}
			count++;
			sum += money;
		}

	}

}
