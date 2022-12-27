/*
Name:Aritra Ghorai
Date:27/Oct/2022
Sample Input: a = {3,2,10,8,5,7,4};
Sample output: 2 3 4 5 7 8 10
*/

public class QuickSort 
{
	public static void sort(int[] a, int start, int end)
	{
		if(start>=end) return;
		
		int pivot=a[(start+end)/2];
		int i=start, j=end;
    
		while(i<=j)
		{
			while(a[i]<pivot) i++;
			while(a[j]>pivot) j--;
			
			if(i<=j)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
			
		}
		sort(a, start, j);
		//System.out.println(j);
		sort(a, i, end);
	}

	public static void main(String[] args) 
	{
		int[] a= {3,7,5,9,2,6};
		sort(a,0,a.length-1);
		for(int n:a)
		{
			System.out.print(n + " ");
		}
	}
}
