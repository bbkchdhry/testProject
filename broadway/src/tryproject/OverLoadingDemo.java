package tryproject;

public class OverLoadingDemo {
	private int id;
	private String name;
	private int age;
	private float salary;

	public OverLoadingDemo(int i, String n) {
		id = i;
		name = n;
	}

	public OverLoadingDemo(float i, int n) //overloading with same parameter but with different datatypes.
	{
		salary = i;
		age = n;
	
	}

	public void display1() {
		System.out.println(id + " " + name);
	}

	public void display2() {
		System.out.println(salary + " " + age);
	}

	public static void main(String[] args) {

		OverLoadingDemo s1 = new OverLoadingDemo(101, "Rajesh");
		s1.display1();
		OverLoadingDemo s2 = new OverLoadingDemo(10000, 19);
		s2.display2();
	}

}
