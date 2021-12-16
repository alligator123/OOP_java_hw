import java.util.Scanner;

public class JPA303 {

	public static void main(String[] args) {
		int sum = 0;
		System.out.print("1~1000中的完美數有:");
		for (int i = 1; i <= 1000; i++) {
			sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			if(sum==i) {
				System.out.print(i+" ");
			}
		}
		
	}

}
