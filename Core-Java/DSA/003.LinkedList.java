/*
Name:Aritra Ghorai
Date:07/Nov/2022
*/

import java.util.LinkedList;

public class LLCollection {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		//add first position
		list.addFirst("a");
		list.addFirst("is");
		System.out.println(list);
		
		//add last position
		list.addLast("list");
		System.out.println(list);
		System.out.println(list.size());
		
		list.addFirst("This");
		System.out.println(list);
		System.out.println(list.size());
		
		//TO get a element
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) +"->");
		}
		System.out.println("null");
		
		//remove with index value
		list.remove(2);
		System.out.println(list);
		
		//remove from first position
		list.removeFirst();
		System.out.println(list);
		
		//remove from last position
		list.removeLast();
		System.out.println(list);	
	}
}
