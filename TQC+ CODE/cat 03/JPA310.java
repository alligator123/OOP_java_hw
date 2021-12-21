import java.util.Scanner;

public class JPA310 {

	public static void main(String[] args) {
		int x, sum = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("請輸入n的值<n>0，且為偶數>:");
			x = sc.nextInt();
			if (x % 2 == 0&x>=0) {
				for(int i=2;i<=x;i+=2) {
					sum +=i;
				}
				System.out.print("2+4+...+"+x+"="+sum);
				break;
			}
		} while (true);
	}

}
