import java.util.Scanner;

public class JPA405 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input n:");
		n = sc.nextInt();
		if (n >= 1) {
			System.out.println(sum2(n));
		}
	}

	static int sum2(int n) {
		if (n == 1) {
			return 2;
		} else {
			return sum2(n - 1) + 2 * n;
		}
	}
}
