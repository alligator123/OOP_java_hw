import java.util.Scanner;

public class JPA307 {

	public static void main(String[] args) {
		int m, n, sum = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Input:");
			m = sc.nextInt();
			if (m == 999) {
				break;
			}
			n = sc.nextInt();
			if (m > n) {
				for (int i = 1; i <= n; i++) {
					if (m % i == 0 & n % i == 0) {
						sum = i;
					}
				}
				System.out.println(sum);
			} else
				for (int i = 1; i <= m; i++) {
					if (m % i == 0 & n % i == 0) {
						sum = i;
					}
				}
			System.out.println(sum);
		}

	}

}
