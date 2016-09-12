package broadwayassignment;

public class House {

	private String houseName;
	private String address;
	private int hNumber;
	private String color;
	private int nop;
	
	public House() {
		houseName = "ABC Niwas";
		address = "Lazimpat";
		hNumber = 259;
		color = "White";
		nop = 5;
	}
	private void display() {
		System.out.println("House Name : " + houseName);
		System.out.println("Address : " + address);
		System.out.println("House Number : " + hNumber);
		System.out.println("House Color : " + color);
		System.out.println("Number of People : " + nop);
	}
	public static void main(String[] args) {
		House details = new House();
		details.display();
	}
}
