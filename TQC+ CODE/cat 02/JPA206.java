import java.util.Scanner;
public class JPA206 {

	public static void main(String[] args) {
	int math,chinese,english;
	Scanner sc = new Scanner(System.in);
	for(int i=1;i<=4;i++) {
		System.out.println("Input Chinese score:");
		chinese = sc.nextInt();
		System.out.println("Input English score:");
		english = sc.nextInt();
		System.out.println("Input Math score:");
		math = sc.nextInt();
		if(math>=60&english>=60&chinese>=60) {
			System.out.println("All Pass");
		}
		if(math<60) {
			System.out.println("Math failed.");
		}
		if(english<60) {
			System.out.println("English failed.");
		}
		if(chinese<60) {
			System.out.println("Chinese failed.");
		}
	}

	}

}
