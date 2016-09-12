package practice;

public class TypeCast {
	static String a="2",b="3";
	static int sum;
	public static void main(String[] args) {
		
		Integer x=Integer.parseInt(a);
		Integer y=Integer.parseInt(b);
		
		sum=x+y;
		
		System.out.println(sum);
		
		String z=Integer.toString(sum);
		
		System.out.println(z);
		
				
	}

}
