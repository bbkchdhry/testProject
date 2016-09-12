package firstprogram;

public class Abc {
Abc x;
static Abc y;

Abc getx(){
	return x;
}

Abc(Abc x){
	this.x= x;
}
Abc(){
	
}
public static void main(String[] args) {
	Abc x=new Abc();
	//Abc y=new Abc();
	Abc i=x.getx();
	System.out.println(i); //result is null
	//i.getx(); 
}

}
