package stringarray;

public class EqualTest {
	public static void main(String[] args) {
		String hel = "Hello".substring(0, 3);// Hel
		System.out.println("String hel = " + hel);
		boolean eqVal = (hel == "Hel");
		System.out.println("hel=='Hel' is: " + eqVal);
		boolean eqFun = hel.equals("Hel");
		System.out.println("hel.equals('Hel') is : " + eqFun);
	}

}
