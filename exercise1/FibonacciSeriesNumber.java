package com.exercise1;

import java.util.Scanner;

public class FibonacciSeriesNumber {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number till you want the series :");
	int n = sc.nextInt();
	int a=0,b=1,c;
	for(int i=0;i<1000;i++) {
		c=a+b;
		if(a<=n) {
			System.out.print(a+" + ");
			a=b;
			b=c;
		}
	}
	}

}
