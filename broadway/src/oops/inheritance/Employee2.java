package oops.inheritance;

public class Employee2 extends Employee1 {
int bonus=10000;

	public static void main(String[] args) {
Employee2 p=new Employee2();
System.out.println("Programmer salary is: "+p.salary);
System.out.println("Bonus of Programmer is: "+p.bonus);
System.out.println("Total salary obtained is: "+(p.salary+p.bonus));
	}

}
