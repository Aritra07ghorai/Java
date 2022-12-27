/*
Name:Aritra Ghorai
Date:28/Oct/2022
Sample Input: a= {4,9,3,5,7,10};
Sample output: 5
              -1
*/


public class LinearSearch 
{
	static int search(int[] a, int s)
	{
		for(int i=0; i<a.length;i++)
		{
			if(a[i]==s) return i;
		}
		return -1;
	}
  
	public static void main(String[] args) 
	{
		int[] a= {4,9,3,5,7,10};
		System.out.println(search(a,10));
		System.out.println(search(a,2));
	}
}
