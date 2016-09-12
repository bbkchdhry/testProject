package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class TreeMapExample {
public static void main(String[] args) {
	
	HashMap<Boolean,String> obj=new HashMap<Boolean,String>();
	obj.put(true, "baglung");
	obj.put(false, "pokhara");
	obj.put(true, "ktm");
	obj.put(false, "dharan");
//	String location=obj.get(1);
//	String location1=obj.get(2);
	obj.remove(false);
	//String location4=obj.get(true);
//
//	
//	
//	System.out.println(location);
//	System.out.println(location1);
//	System.out.println(location4);
//

	Set<?> x=obj.entrySet();
	Iterator<?> y=x.iterator();
	while(y.hasNext())
	{
		Entry<?, ?> m=(Entry<?, ?>) y.next();
		Boolean z=(Boolean)m.getKey();
		String z1=(String)m.getValue();

		System.out.println(z);
		System.out.println(z1);
		
//		i[counter]=z;
//		counter++;
		
//		String v=(String)m.getValue();
//		System.out.println(v);
			

}
	
}

}
