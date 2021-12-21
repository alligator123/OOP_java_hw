import java.util.Scanner;

public class JPA208 {

	public static void main(String[] args) {
		int grade;
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 5; i++) {
			System.out.println("Input:");
			grade = sc.nextInt();
			if (grade >= 90) {
				System.out.println("Your grades is A");
			}
			if (grade>=80&grade<90) {
				System.out.println("Your grades is B");
			}
			if (grade>=70&grade < 80) {
				System.out.println("Your grades is C");
			}
			if (grade>=60&grade<70) {
				System.out.println("Your grades is D");
			}
			if (grade>=0&grade <60) {
				System.out.println("Your grades is F");
			}
		}
	}

}
