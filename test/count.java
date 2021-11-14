package java09;

import java.util.Scanner;

class count {
	public static void is_prime(int a) {
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				sum += 1;
			}
		}
		if (sum == 2) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

	public static void main(String[] args) {
		while (true) {
			Scanner b = new Scanner(System.in);
			System.out.print("input a number");
			int a = b.nextInt();
			is_prime(a);
		}
	}

}
