package com.exercise1;

import java.util.Scanner;

public class ArmstrongNumberWith3Digit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 3 digit Nummber :");
		int n = sc.nextInt();
		int temp = n;
		int a;
		int c=0;
		if(n > 999) {
			System.out.println("Number Should be 3 digit");
		}else {
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

}
