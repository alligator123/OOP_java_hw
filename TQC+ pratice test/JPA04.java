package test;

import java.util.Scanner;

public class JPA04 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Input n(0<=n<=16):");
			n = sc.nextInt();
			if(n==999) {
				break;
			}
			else if(0<=n&n<=16) {
				System.out.println(n+"ªº¶¥­¼ = "+sum(n));
			}
		}
	}

	static long sum(int x) {
		if(x==0) {
			return 0;
		}
		else if (x == 1) {
			return 1;
		} else {
			return x * sum(x - 1);
		}
	}
}
