/*
Name:Aritra Ghorai
Date:29/Oct/2022
Sample Input: a= {{1,2,3},{4,5,6},{7,8,9}}
Sample output: 45
*/

public class TwoDArray {

	public static void main(String[] args) 
	{
		int [][] a= {
				   {1,2,3},
				   {4,5,6},
				   {7,8,9}
				   };
    
		int sum=0;
    
		for(int[] temp:a)
		{
			for(int n:temp)
			{
				sum+=n;
			}
		}
		System.out.println(sum);
	}
}
