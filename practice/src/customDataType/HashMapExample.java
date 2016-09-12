package customDataType;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class HashMapExample implements Comparable<HashMapExample>{
	int id;
	String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		
		HashMapExample obj1=new HashMapExample();
		obj1.setName("Baglung");
		
		HashMapExample obj2=new HashMapExample();
		obj2.setName("Pokhara");
		
		HashMapExample obj3=new HashMapExample();
		obj3.setName("Dharan");
		
		HashMapExample obj4=new HashMapExample();
		obj4.setName("Kathmandu");
		
		HashMapExample obj5=new HashMapExample();
		obj5.setName("Palpa");
		
		HashMap<HashMapExample,Integer> obj=new HashMap<HashMapExample,Integer>();
		obj.put(obj1,134);
		obj.put(obj2,243);
		obj.put(obj3,3);
		obj.put(obj4,44);
		obj.put(obj5,4);
		
		TreeMap<HashMapExample,Integer> x=new TreeMap<HashMapExample,Integer>(obj);
	
		
		Set<?> sobj=x.entrySet();
		Iterator<?> dis = sobj.iterator();
		while (dis.hasNext()) {
			Entry<?, ?> e=(Entry<?, ?>) dis.next();
			
			HashMapExample abc=(HashMapExample) e.getKey();
						
			System.out.println(abc.getName());
			
		//	System.out.println(e.getValue());

			
			
	}
}

	@Override
	public int compareTo(HashMapExample x) {

		return (this.getName().compareTo(x.getName()));
	}
}
