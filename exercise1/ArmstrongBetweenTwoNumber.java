package com.exercise1;

import java.util.Scanner;

public class ArmstrongBetweenTwoNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter low Range :");
		int low = sc.nextInt();
		System.out.println("Enter High Range");
		int high = sc.nextInt();
		
		for(int i = low;i<high;i++) {
			int temp,rem,c= 0;
			temp = i;
			while(temp != 0) {
				rem = temp%10;
				temp = temp/10;
				c = c+(rem*rem*rem);
			}
			if(c == i) {
				System.out.print(i+" ");
			}
		}

	}

}
