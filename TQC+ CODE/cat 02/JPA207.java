import java.util.Scanner;

public class JPA207 {

	public static void main(String[] args) {
		int x, y, z;
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 4; i++) {
			System.out.print("�п�J���:");
			x = sc.nextInt();
			y = sc.nextInt();
			z = sc.nextInt();
			if (x + y > z & x + z > y & y + z > x & x > 0 & y > 0 & z > 0) {
				if (x * x + y * y == z * z | x * x + z * z == y * y | y * y + z * z == x * x) {
					System.out.println("�����T����");
				} else if (x * x + y * y < z * z | x * x + z * z < y * y | y * y + z * z < x * x) {
					System.out.println("�w���T����");
				} else if (x * x + y * y > z * z | x * x + z * z > y * y | y * y + z * z > x * x) {
					System.out.println("�U���T����");
				}
			} else {
				System.out.println("���i�H�c���T����");
			}
		}
	}

}
