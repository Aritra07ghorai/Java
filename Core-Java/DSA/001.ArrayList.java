/*
Name:Aritra Ghorai
Date:05/Nov/2022
*/

import java.util.ArrayList;
import java.util.Collections;


public class ArrayListExample 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> l1= new ArrayList<>();
		
		//add element
		l1.add(4);
		l1.add(8);
		l1.add(6);
		l1.add(5);
		System.out.println(l1);
		
		//get element
		int element = l1.get(2);
		System.out.println(element);
		
		//add element in between
		l1.add(2,3);
		System.out.println(l1);
		
		//set element
		l1.set(1, 2);
		System.out.println(l1);
		
		//delete element
		l1.remove(3);
		System.out.println(l1);
		
		//size
		System.out.println(l1.size());
		
		//loops
		for(int i=0;i<l1.size(); i++)
		{
			System.out.println(l1.get(i));
		}
		
		//sorting
		Collections.sort(l1);
		System.out.println(l1);
		
		//checking any element
		System.out.println(l1.contains(5));
		System.out.println(l1.contains(9));
		
		//add two ArrayList
		ArrayList<Integer> l2= new ArrayList<>();
		l2.add(11);
		l2.add(14);
		l2.add(11);
		l2.add(18);
			
		l1.addAll(l2);
		System.out.println(l1);
		
		//index no (first ocuurance)
		System.out.println(l1.indexOf(14));
		
		//last index
		System.out.println(l1.lastIndexOf(11));
	}
}
