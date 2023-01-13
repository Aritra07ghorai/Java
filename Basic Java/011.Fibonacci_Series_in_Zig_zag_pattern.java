/*
Name:Aritra Ghorai
Date:12/Jan/2023
Description: Print Fibonacci Series in Zig-zag way.
Sample Input: Enter no of line: 5
              First Number: 1
              Second Number: 2
Sample Output: 
  1
    3
      8
        21
          55
        34
      13
    5
  2

*/


import java.util.Scanner;

public class FibbonacciPattern {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		System.out.println("Enter no of line:");
		System.out.println("First Number:");
		System.out.println("Second Number:");

		int l = s.nextInt();
		int a = s.nextInt();
		int b = s.nextInt();

		int arr[] = new int[l * 2 - 1];
		arr[0] = a;
		arr[1] = b;

		for (int i = 2; i < l * 2 - 1; i++) {
			int d = a + b;
			a = b;
			b = d;
			arr[i] = d;
		}
		
		int p = 0;
		for (int i = 0; i < arr.length; i = i + 2) {

			for (int j = l - p; j < l; j++) {
				System.out.print("  ");
			}

			System.out.println(arr[i]);
			p++;
		}
		
		int q = l;
		for (int i = arr.length - 2; i > 0; i = i - 2) {

			for (int j = q - 2; j > 0; j--) {
				System.out.print("  ");
			}

			System.out.println(arr[i]);
			q--;
		}
	}
}
