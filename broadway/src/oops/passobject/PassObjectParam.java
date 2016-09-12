package oops.passobject;

public class PassObjectParam {

	public static void main(String[] args) {
		Student s1 = new Student(1, 50);
		Student s2 = new Student(1, 50);
		Student s3 = new Student(2, 50);
		System.out.println("Object s1==s2:" + s1.equals(s2));
		System.out.println("Object s1==s3:" + s1.equals(s3));

	}

}
