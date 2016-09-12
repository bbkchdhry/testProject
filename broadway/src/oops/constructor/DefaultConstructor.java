package oops.constructor;

public class DefaultConstructor {
	private String course;

	public DefaultConstructor() {
		course = "JAVA";
	}

	private void showCourse() {
		System.out.println("Course is: " + course);
	}

	public static void main(String[] args) {
		DefaultConstructor course = new DefaultConstructor();// Constructor
																// called first.
		course.showCourse();// Course is : JAVA
	}

}
