import java.util.Scanner;

public class JPA209 {

	public static void main(String[] args) {
		double x, y;
		Scanner sc = new Scanner(System.in);
		for(int i = 1;i<=4;i++) {
			System.out.print("請輸入x座標:");
			x = sc.nextDouble();
			System.out.print("請輸入y座標:");
			y = sc.nextDouble();
			if(x==0&y==0) {
				System.out.println("("+x+","+y+")在原點");
			}
			else if(x==0&y!=0) {
				System.out.println("("+x+","+y+")在y軸");
			}
			else if(x!=0&y==0) {
				System.out.println("("+x+","+y+")在x軸");
			}
			else if(x>0&y>0) {
				System.out.println("("+x+","+y+")在第一象限");
			}
			else if(x<0&y>0) {
				System.out.println("("+x+","+y+")在第二象限");
			}
			else if(x<0&y<0) {
				System.out.println("("+x+","+y+")在第三象限");
			}
			else if(x>0&y<0) {
				System.out.println("("+x+","+y+")在第四象限");
			}
		}
	}

}
