package test;
import java.util.Scanner;
public class JPA02 {

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		for(int i = 1;i<=2;i++) {
			System.out.println("Please enter score:");
			x = sc.nextInt();
			if(x>=60) {
				System.out.println("You pass");
			}
			else {
				
			}
			System.out.println("End");
		}
	}

}
