package firstprogram;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e=new Employee(123, "Binod Koirala", 50000.0);
		System.out.println("Employee info:");
		System.out.println("Id:"+e.getId());
		System.out.println("Name:"+e.getName());
		System.out.println("Salary:"+e.getSalary());
	}

}
