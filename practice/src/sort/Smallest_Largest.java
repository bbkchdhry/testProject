package sort;

public class Smallest_Largest {

	public static void main(String[] args) {
		
		int a[]={100, 1, 200, 5, 500, -2};
		int i=0;
		int l=a[i];
		int g=a[i];
		
		for(i=0;i<a.length-1;i++){
			if(l>a[i+1]){
				l=a[i+1];
			}		
			else if(g<a[i+1]){
				g=a[i+1];
			}
		}
		System.out.println("lowest"+" = "+l);
		System.out.println("greatest"+"="+g);

	}

}
