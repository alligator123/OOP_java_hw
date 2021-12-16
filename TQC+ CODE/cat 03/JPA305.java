import java.util.Scanner;

public class JPA305 {

	public static void main(String[] args) {
		int n, sum = 1;
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 3; i++) {
			sum = 1;
			System.out.println("Please enter one vaule:");
			n = sc.nextInt();
			if (1 <= n & n <= 10) {
				for (int j = 1; j <= n; j++) {
					sum = sum * j;
				}
				System.out.println(n+"!="+sum);
			}
			else {
				System.out.println("Error,the vaule is out of range.");
			}
		}
	}

}
