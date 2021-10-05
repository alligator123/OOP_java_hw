
public class class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cddd student = new cddd();
		student.name="Sandy";
		student.height=165.5;
		student.weight=58.2;
		System.out.println("name:"+student.name);
		System.out.println("height:"+student.height);
		System.out.println("weight:"+student.weight);
		System.out.println("BMI="+student.weight/Math.pow(student.height/100,2));
	}

}
