package java08;

public class cbox {
int length;
int width;
int height;
int volume(){
	return length*width*height;
}
int surface(){
	return 1*1*6;
}
void showdata() {
	System.out.println("length="+length);
	System.out.println("width="+width);
	System.out.println("height="+height);
}
void showall() {
	System.out.println("length="+length);
	System.out.println("width="+width);
	System.out.println("height="+height);
	System.out.println("surface="+surface());
	System.out.println("volume="+volume());
}
	public static void main(String[] args) {
		cbox box = new cbox();
		box.length=1;
		box.width=1;
		box.height=1;
		box.showdata();
		box.showall();
	}

}
