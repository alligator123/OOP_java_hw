import java.util.Scanner;

public class JPA502 {

	public static void main(String[] args) {
		int y;
		double x[], sum = 0,average;
		Scanner sc = new Scanner(System.in);
		System.out.print("�п�J�ǥͤH��:");
		y = sc.nextInt();
		x = new double[y];
		for (int i = 0; i < x.length; i++) {
			System.out.print("��" + (i + 1) + "�Ӿǥͪ����Z:");
			x[i] = sc.nextDouble();
		}
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		average = (double)sum/(double)y;
		System.out.println("�H��:"+y);
		System.out.println("�`��:"+sum);
		System.out.println("����:"+average);
	}

}
