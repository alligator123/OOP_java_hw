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
				System.out.println("�\�I�`�O��:"+sum);
				average = sum/(double)count;
				System.out.printf(count+"�D�\�I�����O�ά�:"+"%.2f",average);
				break;
			}
			count++;
			sum += money;
		}

	}

}
