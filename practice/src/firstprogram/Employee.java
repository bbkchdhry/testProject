package firstprogram;

public class Employee {
	private int id;
	private String name;
	private double salary;
	
	public Employee(int i, String s, double sal) {
		id=i;
		name=s;
		salary=sal;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
}
