/*
Name:Aritra Ghorai
Date:26/Oct/2022
Sample Input: a = {3,2,10,8,5,7,4};
Sample output: 2 3 4 5 7 8 10
*/


public class SelectionSort 
{
	public static void sort(int[] a)
	{
		for(int i=0;i<a.length-1; i++)
		{
			int minIndex=i;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[j]<a[minIndex]) minIndex=j;
			}

			if(i!=minIndex)
			{
				int temp=a[i];
				a[i]=a[minIndex];
				a[minIndex]=temp;
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
