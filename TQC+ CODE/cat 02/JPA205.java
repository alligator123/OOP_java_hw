import java.util.Scanner;
public class JPA205 {

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=4;i++) {
			System.out.println("Enter an integer:");
			x = sc.nextInt();
			if(x%2==0&x%3==0&x%6==0) {
				System.out.println(x+"琌236计");
			}
			else if(x%2==0) {
				System.out.println(x+"琌2计");
			}
			else if(x%3==0) {
				System.out.println(x+"琌3计");
			}
			else if(x%6==0) {
				System.out.println(x+"琌6计");
			}
			else if(x%2==0&x%3==0) {
				System.out.println(x+"琌23计");
			}
			else if(x%2==0&x%6==0) {
				System.out.println(x+"琌26计");
			}
			else if(x%3==0&x%6==0) {
				System.out.println(x+"琌36计");
			}
			else {
				System.out.println(x+"ぃ琌236计");
			}
		}

	}

}
