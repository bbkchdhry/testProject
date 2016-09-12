package oops.passobject;

public class Student {
private int id=10;
private int rollNo=30;
public Student (int id,int rollNo){
	this.id=id;
	this.rollNo=rollNo;
}
boolean equals(Student o){
	if(this.id==o.id && this.rollNo==o.rollNo){
		return true;
	}
	return false;
}
}