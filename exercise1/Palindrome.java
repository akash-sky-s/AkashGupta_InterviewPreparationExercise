package com.exercise1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n = sc.nextInt();
		int temp = n;
		int reverse = 0;
		while(n!=0) {
			int remainder = n % 10;
			reverse = reverse*10+remainder;
			n = n/10;
		}
		if(temp == reverse) {
			System.out.println("Palindrome Number");
		}else {
			System.out.println("Not a Palindrome Number");
		}

	}

}
