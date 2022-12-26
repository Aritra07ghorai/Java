/*
Name:Aritra Ghorai
Date:05/Aug/2022
Description: Write a program to check the given number is even or odd.
Sample Input: Enter the value of 'n' : 7
Sample Output: 7 is odd number
*/


import java.util.Scanner;
class Evenodd 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scn.nextInt();

		if((n&1)==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}
}
