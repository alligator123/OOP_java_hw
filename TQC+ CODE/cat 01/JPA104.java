import java.util.Scanner;

public class JPA104 {

	public static void main(String[] args) {
		int x1, y1, x2, y2;
		double distance;
		Scanner sc = new Scanner(System.in);
		System.out.print("輸入第1組的x和y座標:");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		System.out.print("輸入第2組的x和y座標:");
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		distance = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
		System.out.print("介於("+x1+","+y1+")和("+x2+","+y2+")之間的距離是"+distance);
	}

}
