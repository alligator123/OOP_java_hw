import java.util.Scanner;

public class JPA301 {

	public static void main(String[] args) {
		int x, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input:");
		x = sc.nextInt();
		for (int i = 1; i <= x; i++) {
			sum += i;
		}
		System.out.print("1 + ... + "+x+" = "+sum);
	}

}
