package broadwayassignment;

public class Employee {
	private String employeeName;
	private int phone;
	private String address;
	private String position;
	private int salary;
	
	public Employee() {
		employeeName = "Bibek";
		phone = 987654321;
		address = "Lazimpat";
		position = "System Admin";
		salary = 20000;
	}
	private void display() {
		System.out.println("Employee Name : " + employeeName);
		System.out.println("Phone Number : " + phone);
		System.out.println("Address : " + address);
		System.out.println("Position : " + position);
		System.out.println("Salary : " + salary);
	}
	public static void main(String[] args) {
		Employee details = new Employee();
		details.display();
	}
}
