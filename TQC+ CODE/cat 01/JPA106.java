import java.util.Scanner;
public class JPA106 {

	public static void main(String[] args) {
	double x,y;
	Scanner sc = new Scanner(System.in);
	x = -3.2;
	y = 3*(x*x*x)+2*x-1;
	System.out.print("f(-3.2) = ");
	System.out.printf("%.4f",y);
	System.out.println();
	x = -2.1;
	y = 3*(x*x*x)+2*x-1;
	System.out.print("f(-2.1) = ");
	System.out.printf("%.4f",y);
	System.out.println();
	x = 0;
	y = 3*(x*x*x)+2*x-1;
	System.out.print("f(0) = ");
	System.out.printf("%.4f",y);
	System.out.println();
	x = 2.1;
	y = 3*(x*x*x)+2*x-1;
	System.out.print("f(2.1) = ");
	System.out.printf("%.4f",y);
	System.out.println();
	}

}
