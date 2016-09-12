package oops.constructor;

public class ParameterizedConstructor {
	private int length;
	private int breadth;

	public ParameterizedConstructor(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public void calculateArea() {
		int area = length * breadth;
		System.out.println("Area is : " + area);
	}

	public static void main(String[] args) {
		ParameterizedConstructor area = new ParameterizedConstructor(5, 4);
		area.calculateArea();
	}

}
