import java.util.Scanner;
public class JPA505 {

	public static void main(String[] args) {
	String [] x = {"A","B","C","D","E","F","G","H","I","J"};
	System.out.print("����}�C��Ƥ��e:");
	for(int i = 0;i<x.length;i++) {
		System.out.print(" "+x[i]);
	}
	System.out.println();
	System.out.print("����}�C��Ƥ���:");
    for(int i = x.length-1;i>=0;i--) {
    	System.out.print(" "+x[i]);
    }
	}

}
