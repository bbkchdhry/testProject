package dataStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> data = new ArrayList<Integer>();
		data.add(1);
		data.add(2);
		data.add(3);
		data.add(100);
		data.add(500);
		data.add(600);
		data.add(700);
		data.add(800);

		int a = data.get(5);
		System.out.println(a);

		int b = data.get(2);
		System.out.println(b);

		data.add(6, 900);
		int c = data.get(6);
		System.out.println(c);

		/*
		 * int d=data.get(7); System.out.println(d);
		 */
		
		Collections.sort(data); //to do sorting
		
		Iterator<Integer> s =data.iterator();
		while(s.hasNext()){
			System.out.println(s.next());
		}

		
		
		
		
		

	}

}
