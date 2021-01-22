package com.exercise1;

import java.util.Scanner;

public class FactorialNumberUsingRecursion {
	
	static int factorial(int n) {
		if ( n == 0 )
			return 1;
		else
			return(n*factorial(n-1));
	}

	public static void main(String[] args) {
		int i,fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		fact = factorial(n);
		System.out.println("Factorial of"+n+"is: "+fact);

	}

}
