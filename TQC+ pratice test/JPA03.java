package test;

import java.util.Scanner;

public class JPA03 {

	public static void main(String[] args) {
		int N, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input:");
		N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			sum = sum + i;
		}
		System.out.println("1+...+"+N+"="+sum);
	}

}
