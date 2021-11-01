
public class circle {
int radius;
int Long;
int height;
int width; 
double pi=3.14159;
void Cal_area(int r) {
	radius=r;
	System.out.println("半徑="+radius);
	System.out.println("球形體積="+radius*radius*radius*4/3.*pi);
}
void Cal_area(int a,int b,int c) {
	Long = a;
	height = b;
	width = c;
	System.out.println("長="+Long+",寬="+width+",高="+height);
	System.out.println("立方體表面積="+(Long*height*2+Long*width*2+height*width*2));
}
public static void main(String[] args) {
	circle a = new circle();
	a.Cal_area(10);
	a.Cal_area(4,6,5);
}
}
//半徑=10
//球形體積=4188.786666666666
//長=4,寬=5,高=6
//立方體表面積=148