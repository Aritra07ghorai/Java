/*
Name:Aritra Ghorai
Date:12/Nov/2022
*/


import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet();
		
		//Insert
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		
		//Size
		System.out.println("Size of set is= " +set.size());
		
		//print all elements
		System.out.println(set);
		
		//Iterator
		Iterator it = set.iterator();		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Search (Contains)
		if(set.contains(1)) {
			System.out.println("set contains 1");
		}
		if(!set.contains(6)) {
			System.out.println("set doesn't contains 6");
		}
			
		//Delete
		set.remove(1);
		if(!set.contains(1)) {
			System.out.println("set doesn't contains 1");
		}
		System.out.println(set);
	}
}
