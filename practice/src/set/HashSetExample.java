package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<Integer> x = new HashSet<Integer>();
		x.add(72);
		x.add(21);
		x.add(5);
		x.add(6);
		x.add(100);

		x.remove(6); //To remove data

		Iterator<Integer> y = x.iterator();    //To get data
		while (y.hasNext()) {                 //To get data
			Integer k = y.next();            //To get data
			System.out.println(k);          //To get data
		
		}
	}
}
