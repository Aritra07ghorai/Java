/*
Name:Aritra Ghorai
Date:06/Aug/2022
Description: A2. Write a program to find Fibonacci numbers with in a range.
Sample Input: Enter a number: 10
Sample Output: 0 1 1 2 3 5 8
 */

import java.util.Scanner;
class Fibonacci 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the range of Fibonacci series");
		int n=s.nextInt();
		int a=0;
		int b=1;
		int result=0;
		int count=0;
		for(int i=1; i<=n; i++){
			if(count>=4 && count<=9){
				System.out.println(a);
			}
			result=a+b;
			a=b;
			b=result;
			count++;			
		}
	}
}
