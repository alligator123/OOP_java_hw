import java.util.Scanner;
public class JPA103 {

	public static void main(String[] args) {
	int x,y,z;
	Scanner sc = new Scanner(System.in);
	System.out.println("Please input:");
	x = sc.nextInt();
	y = sc.nextInt();
	z = sc.nextInt();
	System.out.print("Average:"+Math.round((double)(x+y+z)/3*100.0)/100.0);
	}

}
