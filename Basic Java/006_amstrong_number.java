/*
Name: Aritra Ghorai
Date: 09/Aug/2022
Description: Write a program to find out amstrong number.
Sample Input: Enter a number: 153
logic: 153 = 1^3+5^3+3^3
Sample Output: 153 is a armstrong number
 */

import java.util.Scanner;
class Armstrong
{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=s.nextInt();
		int temp=n;
		int len=0;
		while(n>0){
			len++;
			n/=10;
		}
		System.out.println("len="+len);
		int sum=0;
		n=temp;
		while(n>0){
			int d=n%10;
			int prod=1;
			for (int i=1; i<=len; i++){
				prod*=d;
				System.out.println(prod);
			}
			sum+=prod;
			n/=10;
		}
		System.out.println("sum="+ sum);
		if(sum==temp){	
			System.out.println(temp+" is a armstrong number");
		}
		else{
			System.out.println(temp+ " is not a armstrong number");
		}
	}
}

