package oops.inheritance;

public class Vehicle2 extends Vehicle1 {
	private int cc;
	private int gears;

	public void attributesCar() {
		System.out.println("Speed of Car: " + super.speed);
		System.out.println("Size of Car: " + size);
		System.out.println("CC of Car: " + cc);
		System.out.println("No of gears of Car: " + gears);
		
	}

	public static void main(String[] args) {
		Vehicle2 c1 = new Vehicle2();
		c1.speed = 200;
		c1.size = 22;
		c1.cc = 1000;
		c1.gears = 5;
		c1.attributes();
		c1.attributesCar();
	}

}
