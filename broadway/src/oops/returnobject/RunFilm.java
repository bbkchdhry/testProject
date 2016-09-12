package oops.returnobject;

public class RunFilm {
Film setData(){
	Film obj=new Film();
	obj.setName("Hero");
	obj.setPrice(500);	
	return obj;
}
void displayData(Film m){
	System.out.println("Name: "+ m.getName());
	System.out.println("Price: "+ m.getPrice());
}
	public static void main(String[] args) {
RunFilm r=new RunFilm();
Film setFilm=r.setData();
r.displayData(setFilm);
	}

}
