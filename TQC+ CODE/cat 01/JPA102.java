import java.util.Scanner;

public class JPA102 {

	public static void main(String[] args) {
		double x;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input:");
		x = sc.nextDouble();
		System.out.printf("%.6f", x);
		System.out.print(" kg = ");
		System.out.printf("%.6f", x*2.20462);
		System.out.print(" ponds");
	}

}
