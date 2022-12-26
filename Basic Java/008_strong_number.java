/*
Name: Aritra Ghorai
Date: 09/Aug/2022
Description: Write a program to find out strong number or not.
Sample Input: Enter a number: 145
Logic: 145 = 1! + 4! + 5!
Sample Output: It is a strong number
 */

import java.util.Scanner;
class StrongNum
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=scn.nextInt();
		int temp=n;
		int sum=0;
    
		while(n>0)
		{
			int b=n%10;
			int prod=1;
      
			for(int i=1; i<=b; i++)
			{
				prod*=i;
			}
			sum+=prod;
			n/=10;
		}
    
		if(sum==temp)
		{
			System.out.println("It is a Strong number");
		}
		else
		{
			System.out.println("It is not a Strong number");
		}
	}

}
