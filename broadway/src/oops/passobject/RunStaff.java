package oops.passobject;

public class RunStaff {
private void displayData(Staff staff){
	System.out.println("Name: "+staff.getName());
	System.out.println("Address: "+staff.getAddress());
	System.out.println("Phone: "+staff.getPhone());
}
	public static void main(String[] args) {
		Staff s=new Staff();
		s.setName("Bibek");
		s.setAddress("Lazimpat");
		s.setPhone(12345);

		RunStaff rs=new RunStaff();
		rs.displayData(s);
		
	}

}
