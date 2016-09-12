package customDataType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class User implements Comparable<User> {
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
		List<User> x = new ArrayList<User>();

		User obj = new User();
		obj.setId(157);
		x.add(obj);

		User obj2 = new User();
		obj2.setId(45);
		x.add(obj2);
		
		User obj3=new User();
		obj3.setId(333);
		x.add(obj3);
		
		User obj4=new User();
		obj4.setId(3);
		x.add(obj4);

		Collections.sort(x);

		Iterator<User> dis = x.iterator();
		while (dis.hasNext()) {
			System.out.println(dis.next().getId());
		}
	}

	@Override
	public int compareTo(User x) {

		return (this.getId() - x.getId());
	}
}
