import java.util.Scanner;

public class JPA209 {

	public static void main(String[] args) {
		double x, y;
		Scanner sc = new Scanner(System.in);
		for(int i = 1;i<=4;i++) {
			System.out.print("�п�Jx�y��:");
			x = sc.nextDouble();
			System.out.print("�п�Jy�y��:");
			y = sc.nextDouble();
			if(x==0&y==0) {
				System.out.println("("+x+","+y+")�b���I");
			}
			else if(x==0&y!=0) {
				System.out.println("("+x+","+y+")�by�b");
			}
			else if(x!=0&y==0) {
				System.out.println("("+x+","+y+")�bx�b");
			}
			else if(x>0&y>0) {
				System.out.println("("+x+","+y+")�b�Ĥ@�H��");
			}
			else if(x<0&y>0) {
				System.out.println("("+x+","+y+")�b�ĤG�H��");
			}
			else if(x<0&y<0) {
				System.out.println("("+x+","+y+")�b�ĤT�H��");
			}
			else if(x>0&y<0) {
				System.out.println("("+x+","+y+")�b�ĥ|�H��");
			}
		}
	}

}
