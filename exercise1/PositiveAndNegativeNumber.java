package com.exercise1;

import java.util.Scanner;

public class PositiveAndNegativeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n = sc.nextInt();
		if(n>=0) {
			System.out.println(+n+" is Positive Number");
		}
		else {
			System.out.println(+n+" is Negative Number");
		}

	}

}
