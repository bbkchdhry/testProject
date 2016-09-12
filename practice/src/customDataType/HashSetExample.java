package customDataType;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;


public class HashSetExample implements Comparable<HashSetExample>{
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
		HashSet<HashSetExample> x = new HashSet<HashSetExample>();

		HashSetExample obj = new HashSetExample();
		obj.setId(157);
		x.add(obj);

		HashSetExample obj2 = new HashSetExample();
		obj2.setId(45);
		x.add(obj2);
		
		HashSetExample obj3=new HashSetExample();
		obj3.setId(333);
		x.add(obj3);
		
		HashSetExample obj4=new HashSetExample();
		obj4.setId(3);
		x.add(obj4);
		
		TreeSet<HashSetExample> z=new TreeSet<HashSetExample>(x);
		
/*		Collections.sort(z);
*/		
		Iterator<HashSetExample> dis = z.iterator();
		while (dis.hasNext()) {
			System.out.println(dis.next().getId());
		}
	}

	@Override
	public int compareTo(HashSetExample x) {
		return (this.getId() - x.getId());
	}
}
