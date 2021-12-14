import java.util.Scanner;
public class JPA204 {

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=2;i++) {
			System.out.println("Input:");
			x = sc.nextInt();
			if(x%5==0&x%9==0) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}

	}

}
