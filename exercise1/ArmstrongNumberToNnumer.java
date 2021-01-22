package com.exercise1;

import java.util.Scanner;

public class ArmstrongNumberToNnumer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Nummber :");
		int n = sc.nextInt();
		int temp = n;
		int a;
		int c=0;
		while(n>0) {
			a = n%10;
			n = n/10;
			c=c+(a*a*a);
		}
		if(temp == c)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not Armstrong Number");
	}

}
