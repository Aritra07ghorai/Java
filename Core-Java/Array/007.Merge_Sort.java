/*
Name:Aritra Ghorai
Date:27/Oct/2022
Sample Input: a = {3,2,10,8,5,7,4};
Sample output: 2 3 4 5 7 8 10
*/

public class MergeSort 
{
	private static void merge(int[] a, int[] b, int[] c)
	{
		int i=0, j=0, k=0;
		while(i<a.length && j<b.length)
		{
			if(a[i]<b[j])
			{
				c[k]=a[i];
				i++;
				k++;
			}
			else
			{
				c[k]=b[j];
				j++;
				k++;
			}
		}
		while(i<a.length)
		{
			c[k]=a[i];
			i++;
			k++;
		}
		while(j<b.length)
		{
			c[k]=b[j];
			j++;
			k++;
		}
	}
  
	public static void sort(int[] a)
	{
		if(a.length==1) return;
		int[] l=new int[a.length/2];
		int[] r=new int[a.length-l.length];
		int i=0;
		while(i<l.length)
		{
			l[i]=a[i];
			i++;
		}
		int j=0;
		while(j<r.length)
		{
			r[j]=a[i];
			i++;
			j++;
		}
		sort(l);
		sort(r);
		merge(l,r,a);
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
