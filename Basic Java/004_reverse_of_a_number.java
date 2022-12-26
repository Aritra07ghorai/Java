/*
Name: Aritra Ghorai
Date: 08/Aug/2022
Description: Write a program to find out reverse of a number.
Sample Input: Enter a number: 758
Sample Output: 857
 */

import java.util.Scanner;
class Reverse
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
    System.out.println("Reverse number of " + n + "is= " + rev);
  }
}
