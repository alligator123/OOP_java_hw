import java.util.Scanner;
public class JPA306 {

	public static void main(String[] args) {
	int m ,n;
	Scanner sc = new Scanner(System.in);
	while(true) {
		System.out.println("Input:");
		m = sc.nextInt();
		n = sc.nextInt();
		if(m==999) {
			break;
		}
		System.out.println((long)Math.pow(m,n));
	}
	}

}
