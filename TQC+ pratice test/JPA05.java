package test;
import java.util.Scanner;
public class JPA05 {

	public static void main(String[] args) {
	int []x = new int [10];
	int count=0,sum=0;
	Scanner sc = new Scanner(System.in);
    System.out.println("�п�J10�Ӿ��:");
    for(int i=0;i<x.length;i++) {
    	System.out.print("��"+(i+1)+"�Ӿ��:");
    	x[i] = sc.nextInt();
    }
    for(int i = 0;i<x.length;i++) {
    	if(x[i]>60) {
    		count++;
    		sum+=x[i];
    	}
    }
    System.out.println("�}�C���j��60����"+count+"��");
    System.out.println("�`�X��"+sum);
    System.out.println("�����Ȭ�"+(double)sum/count);
	}

}
