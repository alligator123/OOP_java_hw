import java.util.Scanner;

public class JPA203 {

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 2; i++) {
			System.out.println("Input an integer:");
			x = sc.nextInt();
			if(x%2==0) {
				System.out.println("The number is even.");
			}
			else {
				System.out.println("The number is odd.");
			}
		}
	}

}
