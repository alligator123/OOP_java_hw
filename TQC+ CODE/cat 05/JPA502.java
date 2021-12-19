import java.util.Scanner;

public class JPA502 {

	public static void main(String[] args) {
		int y;
		double x[], sum = 0,average;
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入學生人數:");
		y = sc.nextInt();
		x = new double[y];
		for (int i = 0; i < x.length; i++) {
			System.out.print("第" + (i + 1) + "個學生的成績:");
			x[i] = sc.nextDouble();
		}
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		average = (double)sum/(double)y;
		System.out.println("人數:"+y);
		System.out.println("總分:"+sum);
		System.out.println("平均:"+average);
	}

}
