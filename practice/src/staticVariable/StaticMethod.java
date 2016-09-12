package staticVariable;

public class StaticMethod {
static void print(){
	System.out.println("Hello");
//printthis(); //cannot call non-static method from static method
}

void printthis(){
	System.out.println("Hello non static");
//print(); //we can call static method from non-static method
}
}
