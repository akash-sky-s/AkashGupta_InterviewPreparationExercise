package com.exercise1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n = sc.nextInt();
		boolean flag = false;
		if(n == 1 || n == 0) {
			System.out.println(+n+" is not a Prime Number");
		}
		else {
			for(int i = 2;i<=n/2;i++) {
				if(n%i == 0) {
					System.out.println(+n+" is not a Prime Number");
					flag = true;
					break;
				}
			}
			if(flag == false) {
				System.out.println(+n+" is a Prime Number");
			}
		}
		
	}

}
