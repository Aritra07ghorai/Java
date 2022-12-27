/*
Name:Aritra Ghorai
Date:13/Nov/2022
*/


import java.util.Iterator;
import java.util.TreeSet;

public class TreeExample {
	public static void main(String[] args) {
		TreeSet<Integer> tset = new TreeSet<>();
		tset.add(2);
		tset.add(4);
		tset.add(8);
		tset.add(5);
		tset.add(6);
		tset.add(3);
		
		//printing elements
		System.out.println("TreeSet content is: " + tset);
		
		//removing elements
		tset.remove(4);
		System.out.print("TreeSet content is: ");
		
		//printing elements
		Iterator<Integer> it = tset.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		
		//printing first & last element
		System.out.println("First element is: " + tset.first());
		System.out.println("Last element is: " + tset.last());
		
		//removing first & last element
		tset.pollFirst();
		tset.pollLast();
		System.out.println("TreeSet content is: " + tset);
	}
}
