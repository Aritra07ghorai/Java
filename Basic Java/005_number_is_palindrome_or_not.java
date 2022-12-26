/*
Name: Aritra Ghorai
Date: 08/Aug/2022
Description: Write a program to find out given number is palindromeor not.
Sample Input: Enter a number: 35053
Sample Output: 35053 is a palindrome number
 */

import java.util.Scanner;
class Palindrome
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
    int m = n;
    int rev = 0;
    
    while(m>0)
    {
      rev =(rev*10) + (m%10);
      m/=10;
    }
    
    if(n==rev)
    {
      System.out.println(n + "is a palindrome number");
    }else{
      System.out.println(n + "is not a palindrome number");
    }
  }
}
