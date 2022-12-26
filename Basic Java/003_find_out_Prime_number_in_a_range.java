/*
Name:Aritra Ghorai
Date:07/Aug/2022
Description: Write a program to check the given number is prime or not.
Sample Input: Enter the value of 'a' : 5
Sample Input: Enter the value of 'a' : 15
Sample Output: 7,11,13
*/

import java.util.Scanner;
class PrimeNum
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter any number");
		int a=scn.nextInt();
		int b=scn.nextInt();

		for(int i=a; i<=b; i++){
			if(i<=1) continue;

			boolean flag=true;
			for(int j=2; j<=i/2; j++)
				if(i%j==0){
					flag=false;
					break;
				}
		if(flag){
			System.out.println(i+",");
		}
	}
	}
}
