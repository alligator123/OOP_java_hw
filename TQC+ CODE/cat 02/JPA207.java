import java.util.Scanner;

public class JPA207 {

	public static void main(String[] args) {
		int x, y, z;
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 4; i++) {
			System.out.print("請輸入整數:");
			x = sc.nextInt();
			y = sc.nextInt();
			z = sc.nextInt();
			if (x + y > z & x + z > y & y + z > x & x > 0 & y > 0 & z > 0) {
				if (x * x + y * y == z * z | x * x + z * z == y * y | y * y + z * z == x * x) {
					System.out.println("直角三角形");
				} else if (x * x + y * y < z * z | x * x + z * z < y * y | y * y + z * z < x * x) {
					System.out.println("鈍角三角形");
				} else if (x * x + y * y > z * z | x * x + z * z > y * y | y * y + z * z > x * x) {
					System.out.println("銳角三角形");
				}
			} else {
				System.out.println("不可以構成三角形");
			}
		}
	}

}
