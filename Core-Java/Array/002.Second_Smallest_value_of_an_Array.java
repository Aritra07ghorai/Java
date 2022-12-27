/*
Name:Aritra Ghorai
Date:25/Oct/2022
Sample Input: a = {4,16,5,8,10,48};
Sample output: Second Smallest valueis = 5
*/

public class SecondSmallest
{
	public static void main(String[] args) 
	{
		int[]a = {4,16,5,8,10,48};
		int smallest1 =a[0];
		int smallest2 =a[0];
		
		for(int i=1; i<a.length; i++)
		{
			if(a[i]==smallest1) continue;
			if(a[i]<smallest1)
			{
				smallest2=smallest1;
				smallest1=a[i];
			}
			else if(smallest1==smallest2 || a[i]<smallest2)
			{
				smallest2=a[i];
			}
		}
		System.out.println(smallest2);
	}
}
