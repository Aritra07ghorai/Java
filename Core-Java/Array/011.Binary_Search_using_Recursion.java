/*
Name:Aritra Ghorai
Date:28/Oct/2022
Sample Input: a= {2,4,5,7,10,12}
Sample output: 4
              -1
*/

public class BinearySearchRecursion 
{
	static int search(int[]a, int s, int start, int end)
	{
		if(start>end) return -1;
		int mid=(start+end)/2;
		if(s==a[mid]) return mid;
		else if(s<a[mid]) return search(a,s,start,mid-1);
		else return search(a, s, mid+1, end);
	}

	public static void main(String[] args)
	{
		int[] a= {2,4,5,7,10,12};
		System.out.println(search(a,10,0,a.length-1));
		System.out.println(search(a,8,0,a.length-1));
	}
}
