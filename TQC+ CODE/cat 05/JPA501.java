import java.util.Scanner;

public class JPA501 {

	public static void main(String[] args) {
		int x[],sum=0,count=0;
		double average;
		x = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入10個整數:");
		for (int i = 0; i < x.length; i++) {
			System.out.print("請輸入第"+(i+1)+"個整數:");
			x[i] = sc.nextInt();
		}
		for(int i = 0;i<x.length;i++) {
			if(x[i]>60) {
				count++;
				sum += x[i];
			}
		}
		average = (double)sum/count;
		System.out.println("陣列中大於60的有"+count+"個");
		System.out.println("總合為"+sum);
		System.out.println("平均值為"+average);
	}

}
