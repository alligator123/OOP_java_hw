import java.util.Scanner;

public class JPA104 {

	public static void main(String[] args) {
		int x1, y1, x2, y2;
		double distance;
		Scanner sc = new Scanner(System.in);
		System.out.print("��J��1�ժ�x�My�y��:");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		System.out.print("��J��2�ժ�x�My�y��:");
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		distance = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
		System.out.print("����("+x1+","+y1+")�M("+x2+","+y2+")�������Z���O"+distance);
	}

}
