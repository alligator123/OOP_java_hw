
public class JPA110 {

	public static void main(String[] args) {
		double radius,pi,end,height,length,width,circle,triangle,rectangle,area;
    radius = 5;
    pi = 3.1415926;
    end = 10;
    height = 5;
    length = 5;
    width = 10;
    circle = radius*radius*pi;
    triangle = end * height/2;
    rectangle = length*width;
    area = circle+triangle+rectangle;
    System.out.println("��έ��n��:"+circle);
    System.out.print("�T���έ��n��:");
    System.out.printf("%.6f",triangle);
    System.out.println();
    System.out.print("��έ��n��:");
    System.out.printf("%.6f",rectangle);
    System.out.println();
    System.out.println("���ϧέ��n��:"+area);
	}

}
