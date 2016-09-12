package oops.override;

public class Bike extends Vehicle3 {
public void run(){
	System.out.println("Bike is Running!");
}
	public static void main(String[] args) {
Bike bike=new Bike();
bike.run();
	}

}
