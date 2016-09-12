package firstprogram;

public class DataStorage {
int a=1,b=2;
DataStorage c;
int d;

public int getA() {
	return a;
}

public void setA(int a) {
	this.a = a;
}

public int getB() {
	return b;
}

public void setB(int b) {
	this.b = b;
}

public DataStorage getC() {
	return c;
}

public void setC(DataStorage c) {
	this.c = c;
}

public int getD() {
	return d;
}

public void setD(int d) {
	this.d = d;
}


public static void main(String[] args) {
	DataStorage x=new DataStorage();
	System.out.println(x.a);
	System.out.println(x.b);
	System.out.println(x.c);
	System.out.println(x.d);
	x.getC().getA();
}
}
