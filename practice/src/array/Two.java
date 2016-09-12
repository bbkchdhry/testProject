package array;

public class Two {

	public static void main(String[] args) {

		One obj1 = new One();
		int x[] = { 1, 2, 3, 4, 5, 6, 7 };
		obj1.setX(x);
		int a[]=obj1.getX();
		
		One obj2 = new One();
		boolean y[] = { false, false, true, true };
		obj2.setY(y);
		boolean b[]=obj2.getY();
		
		One obj3 = new One();
		double z[] = { 1.0, 1.1, 1.3, 1.4, 1.5 };
		obj3.setZ(z);
		double c[]=obj3.getZ();
	
	for(int i=0;i<7;i++){
		System.out.println(a[i]);
	}
	
	for(int j=0;j<4;j++){
		System.out.println(b[j]);
	}
	
	for(int k=0;k<5;k++){
		System.out.println(c[k]);
	}
	
	
	
	}

}
