/*
Name: Aritra Ghorai
Date: 10/Aug/2022
Description: Write a program to convert binary number from decimal number.
Sample Input: Enter a number: 6
Logic: 6 = 1+2+3
Sample Output: It is a perfect number
 */

import java.util.Scanner;
class DecToBinary
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any decimal number");
		int n=s.nextInt();
		int b=0;
		int i=1;
		int bin=0;

		while(n>0)
		{
			b=n%10;
			if(b>1){
				System.out.println("Please enter correct input");
				return;
			}
			bin+=(b*i);
			n/=10;
			i*=2;
		}
		System.out.println("Binary number is " +bin);
	}
}


