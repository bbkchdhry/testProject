package broadwayassignment;

public class Country {
	private String countryName;
	private int code;
	private int population;
	private String nanimal;
	private String ncolour;
	
	public Country() {
		countryName = "Nepal";
		code = 997;
		population = 123456;
		nanimal = "Cow";
		ncolour = "Creamson";
	}
	private void display() {
		System.out.println("Country Name : " + countryName);
		System.out.println("Country code : " + code);
		System.out.println("Population : " + population);
		System.out.println("National Animal : " + nanimal);
		System.out.println("National Colour : " + ncolour);
	}
	public static void main(String[] args) {
		Country details = new Country();
		details.display();
	}
}
