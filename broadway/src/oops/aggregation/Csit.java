package oops.aggregation;

class Csit {
	String semester;
	int batch;
	Student student;

	public Csit(String semester, int batch, Student student) {
		this.semester = semester;
		this.batch = batch;
		this.student = student;
	}

	void display() {
		System.out.println("Csit Semester:" + semester + " " + "Batch:" + batch);
		System.out.println();
		System.out.println("Student Name:" + student.name + " " + "Id:"
				+ student.id + " " + "Address:" + student.address + " "
				+ "Elective Subject:" + student.elective);
		System.out.println();

	}

	public static void main(String[] args) {
		Student student1 = new Student("Bibek", 101, "Lazimpat", "E-commerce");
		Student student2 = new Student("Bibek", 101, "Lazimpat", "DBA");

		Csit csit1 = new Csit("Sixth", 2069, student1);
		Csit csit2 = new Csit("Seventh", 2069, student2);
		csit1.display();
		csit2.display();
	}
}
