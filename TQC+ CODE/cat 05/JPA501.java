import java.util.Scanner;

public class JPA501 {

	public static void main(String[] args) {
		int x[],sum=0,count=0;
		double average;
		x = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("�п�J10�Ӿ��:");
		for (int i = 0; i < x.length; i++) {
			System.out.print("�п�J��"+(i+1)+"�Ӿ��:");
			x[i] = sc.nextInt();
		}
		for(int i = 0;i<x.length;i++) {
			if(x[i]>60) {
				count++;
				sum += x[i];
			}
		}
		average = (double)sum/count;
		System.out.println("�}�C���j��60����"+count+"��");
		System.out.println("�`�X��"+sum);
		System.out.println("�����Ȭ�"+average);
	}

}
