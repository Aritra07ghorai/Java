/*
Name:Aritra Ghorai
Date:26/Oct/2022
Sample Input: a = {3,2,10,8,5,7,4};
Sample output: 2 3 4 5 7 8 10
*/

public class BubbleSort
{
	public static void sort(int[] a)
	{
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=0; j<a.length-1-i; j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
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
