import java.util.Scanner;

public class JPA210 {
	public static void main(String[] args) {
		char x;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a character:");
		x = sc.next().charAt(0);
		switch(x) {
		case 'a':
			System.out.println("You enter a or b");
			break;
		case 'b':
			System.out.println("You enter a or b");
			break;
		case 'x':
			System.out.println("You entered x");
			break;
		case 'y':
			System.out.println("You entered y");
			break;
			default:
				System.out.println("You entered something else.");
		}
		
	}

}
