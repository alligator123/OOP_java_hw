import java.util.Scanner;

public class JPA401 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Input n (0<=n<=16):");
			n = sc.nextInt();
			if (n == 999) {
				break;
			}
			if (0 <= n & n <= 16) {
				System.out.println(n + " ªº¶¥­¼ = " + f(n));
			}
		}
	}

	static long f(int x) {
		if (x == 0) {
			return 0;
		} else if (x == 1) {
			return 1;
		} else {
			return x * f(x - 1);
		}
	}
}
