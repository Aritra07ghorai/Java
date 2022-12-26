/*
Name: Aritra Ghorai
Date: 08/Aug/2022
Description: Write a program to find out perfect number or not.
Sample Input: Enter a number: 6
Logic: 6 = 1+2+3
Sample Output: It is a perfect number
 */

import java.util.Scanner;
class PerfectNum
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=scn.nextInt();
		int temp=n;
		int sum=0;
    
		for(int i=1; i<=n/2; i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
	
    if(sum==temp)
		{
			System.out.println("It is a perfect number");
		}
		else
		{
			System.out.println("It is not a perfect number");
		}
	}
}

