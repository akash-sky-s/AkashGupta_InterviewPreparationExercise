package com.exercise1;

import java.util.Scanner;

public class SwappingNumberWithTemp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int a = sc.nextInt();
		System.out.println("Enter Second number: ");
		int b = sc.nextInt();
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("Swapping Number :"+a+" "+b);

	}

}
