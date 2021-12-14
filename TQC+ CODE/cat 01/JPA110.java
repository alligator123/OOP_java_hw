
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
    System.out.println("圓形面積為:"+circle);
    System.out.print("三角形面積為:");
    System.out.printf("%.6f",triangle);
    System.out.println();
    System.out.print("方形面積為:");
    System.out.printf("%.6f",rectangle);
    System.out.println();
    System.out.println("此圖形面積為:"+area);
	}

}
