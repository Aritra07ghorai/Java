/*
Name:Aritra Ghorai
Date:26/Oct/2022
Sample Input: a = {3,2,10,8,5,7,4};
Sample output: 2 3 4 5 7 8 10
*/


public class IncertionSort 
{
	public static void sort(int[] a)
	{
		for(int i=1; i<a.length; i++)
		{
			int key = a[i];
			int j =i-1;
			while(j>-1 && a[j]>key)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}

	public static void main(String[] args) 
	{
		int[] a= {3,2,10,8,5,7,4};
		sort(a);
		for(int n:a)
		{
			System.out.println(n);
		}
	}
}
