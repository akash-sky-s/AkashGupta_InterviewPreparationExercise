package com.exercise1;

import java.util.Scanner;

public class SwappingNumberWithoutTemp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int a = sc.nextInt();
		System.out.println("Enter Second number: ");
		int b = sc.nextInt();
		a = a - b;	// a=0
		b = a + b;  // b =1
		a = b - a;  // a=1
		System.out.println("Swapping Number :"+a+" "+b);

	}

}
