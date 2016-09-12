package map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapExample {
public static void main(String[] args) {
	
	LinkedHashMap<Integer,String> obj=new LinkedHashMap<Integer,String>();
	obj.put(134, "baglung");
	obj.put(243, "pokhara");
	obj.put(3, "ktm");
	obj.put(44, "dharan");
	String location=obj.get(1);
	String location1=obj.get(2);
//	obj.remove(134);
//	String location4=obj.get(4);
//
//	
//	
	System.out.println(location);
	System.out.println(location1);
//	System.out.println(location4);
//
int counter=0;	
Integer[] i=new Integer[10];
	Set<?> x=obj.entrySet();
	Iterator<?> y=x.iterator();
	while(y.hasNext())
	{
		Entry<?, ?> m=(Entry<?, ?>) y.next();
		Integer z=(Integer)m.getKey();
		String z1=(String)m.getValue();

		System.out.println(z);
		System.out.println(z1);
		
		i[counter]=z;
		counter++;
		
//		String v=(String)m.getValue();
//		System.out.println(v);
			

}
	
}

}
