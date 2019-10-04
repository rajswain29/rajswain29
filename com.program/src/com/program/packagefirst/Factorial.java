package com.program.packagefirst;

import java.util.Scanner;

public class Factorial {

	public static void main (String [] arg) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		int factorial = fact(num);
		System.out.println("Factorial of the number"+ factorial);
		
		//123
	}

	private static int fact(int n) {
		// TODO Auto-generated method stub
		int output;
		if(n==1) {
		return 1;
		}
		
		output=fact(n-1)*n;
		return output;
	}
}
