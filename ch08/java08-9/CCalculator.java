package java08;

public class CCalculator {
int a;
int b;
int c;
void set_value(int x,int y,int z) {
	a = x;
	b = y;
	c = z;
}
void show() {
	System.out.println(add());
	System.out.println(sub());
	System.out.println(mul());
	System.out.println(avg());
}
int add() {
	return a+b+c;
}
int sub() {
	return a-b-c;
}
int mul() {
	return a*b*c;
}
double avg() {
	return (a+b+c)/3;
}
	public static void main(String[] args) {
		CCalculator obj = new CCalculator();
		obj.set_value(25, 3, 7);
		obj.show();

	}

}
