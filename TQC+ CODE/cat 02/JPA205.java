import java.util.Scanner;
public class JPA205 {

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=4;i++) {
			System.out.println("Enter an integer:");
			x = sc.nextInt();
			if(x%2==0&x%3==0&x%6==0) {
				System.out.println(x+"�O2�B3�B6������");
			}
			else if(x%2==0) {
				System.out.println(x+"�O2������");
			}
			else if(x%3==0) {
				System.out.println(x+"�O3������");
			}
			else if(x%6==0) {
				System.out.println(x+"�O6������");
			}
			else if(x%2==0&x%3==0) {
				System.out.println(x+"�O2�B3������");
			}
			else if(x%2==0&x%6==0) {
				System.out.println(x+"�O2�B6������");
			}
			else if(x%3==0&x%6==0) {
				System.out.println(x+"�O3�B6������");
			}
			else {
				System.out.println(x+"���O2�B3�B6������");
			}
		}

	}

}
