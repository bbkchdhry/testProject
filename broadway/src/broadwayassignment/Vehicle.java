package broadwayassignment;

public class Vehicle {

	private String type;
	private String brand;
	private int speed;
	private String color;
	private long price;
	
	public Vehicle() {
		type = "CAR";
		brand = "Maruti";
		speed = 100;
		color = "Black";
		price = 150000;
	}
	private void display() {
		System.out.println("Vehicle Type : " + type);
		System.out.println("Brand : " + brand);
		System.out.println("Speed : " + speed + " km/hr ");
		System.out.println("Color : " + color);
		System.out.println("Price : " + price);
	}
	public static void main(String[] args) {
		Vehicle details = new Vehicle();
		details.display();
	}
}