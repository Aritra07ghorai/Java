/*
Name:Aritra Ghorai
Date:25/Oct/2022
Sample Input: a = {3,8,6,10,5};
Sample output: Max value is = 10
               Min value is = 3
*/

public class MaxMinValue {
	public static void main(String[] args) {
		int[] a = {3,8,6,10,5};
		int max = a[0];
		int min = a[0];
		
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) max = a[i];
			if(a[i]<min) min = a[i];
		}
		System.out.println("Max value is = " + max);
		System.out.println("Min value is = " + min);
	}
}
