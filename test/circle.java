
public class circle {
int radius;
int Long;
int height;
int width; 
double pi=3.14159;
void Cal_area(int r) {
	radius=r;
	System.out.println("�b�|="+radius);
	System.out.println("�y����n="+radius*radius*radius*4/3.*pi);
}
void Cal_area(int a,int b,int c) {
	Long = a;
	height = b;
	width = c;
	System.out.println("��="+Long+",�e="+width+",��="+height);
	System.out.println("�ߤ�����n="+(Long*height*2+Long*width*2+height*width*2));
}
public static void main(String[] args) {
	circle a = new circle();
	a.Cal_area(10);
	a.Cal_area(4,6,5);
}
}
//�b�|=10
//�y����n=4188.786666666666
//��=4,�e=5,��=6
//�ߤ�����n=148