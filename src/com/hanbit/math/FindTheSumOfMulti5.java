package com.hanbit.math;

import java.util.Scanner;

/**
@FILE  : FindTheSumOfMulti5.java
@DATE  : 2016. 12. 27.
@AUTHOR: J.John Park
@STORY
[Console]
Integer from 1 to [input]
The number of Multi 5 : ?
The Sum:
 */
public class FindTheSumOfMulti5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0, count = 0, sum = 0;
		boolean endloop = true;
		while(endloop) {
			System.out.print("Enter the integer number:");
			input = sc.nextInt();
			if(input==-1) {
				endloop = false;
			} else if (input<5) {
				System.out.println("Please input again.");
			} else {
			switch(input%5) {
				case 0:
					for(int i=input; i>0; i-=5) {
						count++;
						sum+=i;
					}
					break;
				case 1: case 2: case 3: case 4:
					input -= input%5;
					for(int i=input; i>0; i-=5) {
						count++;
						sum+=i;
					}
					break;
				}
			System.out.println("The Number of Multi 5 is : '" + count + "'");
			System.out.println("The Sum is : '" + sum + "'");
			// sum = 0, count = 0; // if the user want each values
			}
		}
	}
}
