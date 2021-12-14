import java.util.Scanner;

public class JPA201 {

	public static void main(String[] args) {
		int score,count;
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=2;i++) {
			System.out.println("Please enter score:");
			score = sc.nextInt();
			if (score >= 60) {
				System.out.println("You pass");
			} else {
			}
			System.out.println("End");
		}

	}

}
