/*
Name:Aritra Ghorai
Date:28/Oct/2022
Sample Input: a= {2,4,8,3,7,5};
Sample output: 2
              -1
*/

public class BinarySearchLoop 
{
	static int search(int[] a, int s)
	{
		int start =0;
		int end = a.length-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(s==a[mid]) return mid;
			else if(s<a[mid]) end=mid-1;
			else if(s>a[mid]) start=mid+1;
		}
		return -1;
	}

	public static void main(String[] args) 
	{
		int[] a= {2,4,8,3,7,5};
		System.out.println(search(a,8));
		System.out.println(search(a,6));
	}
}
