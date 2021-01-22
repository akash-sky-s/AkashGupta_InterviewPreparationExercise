package com.exercise1;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the term till series you want :");
		int a=0,b=1,c;
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}

}

//Logic
//i=0				i=1				i=2		i=3		i=4
//op=0				op=1			op=1	op=2	op=3
//c=1				c=2				c=3		c=5		c=8
//a=1				a=1				a=2     a=3		a=5
//b=1				b=2				b=3		b=5		b=8
//i=1				i=2				i=3		i=4		i=5