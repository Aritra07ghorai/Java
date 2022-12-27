/*
Name:Aritra Ghorai
Date:25/Oct/2022
Sample Input: num = {7,5,8,9,5,2,10};
Sample output: Index value of 5 is = 4
*/

public class Demo 
{
	public static void main(String[] args) 
	{
		int[] num = {7,5,8,9,5,2,10};
		int element = 5;		
		int index = 0;
		for(int i=0; i<num.length; i++)
		{
			if(num[i]==element) index=i;
		}
		System.out.println("Index value of 5 is = " + index);
	}
}
