import java.util.Scanner;
public class JPA202 {

	public static void main(String[] args) {
	int x,y;
	Scanner sc = new Scanner(System.in);
	for(int i = 1;i<=2;i++) {
		System.out.println("Input:");
		x = sc.nextInt();
		y = sc.nextInt();
		if (x>y) {
			System.out.println(x+" is larger than "+y);
		}
		else if(x<y) {
			System.out.println(y+" is larger than "+x);
		}
	}

	}

}
