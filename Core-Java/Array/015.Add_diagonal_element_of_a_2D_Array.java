/*
Name:Aritra Ghorai
Date:29/Oct/2022
Sample Input: a= {{1,2,3},{4,5,6},{7,8,9}}
Sample output: 15
*/


public class AddDigonal {
	public static void main(String[] args) {
		int [][] a= {
				   {1,2,3},
				   {4,5,6},
				   {7,8,9}
				   };
 
		int sum=0;
 
		for(int i=0; i<a.length; i++) {
			sum+= a[i][i];
		}
		System.out.println(sum);
	}
}
