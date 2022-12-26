/*
Name: Aritra Ghorai
Date: 10/Aug/2022
Description: Write a program to convert binary number from decimal number.
Sample Input: Enter a number: 6
Logic: 6 = 1+2+3
Sample Output: It is a perfect number
 */

import java.util.Scanner;
class BinToDec
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=s.nextInt();
		int i=1;
		int bin=0;
    
		while(n>0)
		{
			int b=n%2;
			bin=(b*i)+ bin;
			n/=2;
			i*=10;
		}
		System.out.println("Thr binary number is " +bin);
	}
}

