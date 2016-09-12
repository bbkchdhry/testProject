package oops.superclass;

public class Bike extends Vehicle {
	Bike() {
		super(1);
	}

	int speed = 50;

	public void displaySpeed() {
		System.out.println("Bike Speed: " + speed);
		System.out.println("Vehicle Speed: " + super.speed);
		super.message();// message(); will also call the parent method since
						// only one method is applied.

	}

	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.displaySpeed();

	}

}
