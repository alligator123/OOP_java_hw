import java.util.Scanner;
public class JPA309 {

	public static void main(String[] args) {
		int x,sum=0;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		for(int i =1;i<=x;i++) {
			if(i%3==0|i%5==0&i%7!=0) {
				continue;
			}
			sum +=i;
		}
		System.out.print("Answer:"+sum);

	}

}
