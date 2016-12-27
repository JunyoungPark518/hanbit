package com.hanbit.math;

import java.util.Scanner;

/**
@FILE  : NumberGolf.java
@DATE  : 2016. 12. 27.
@AUTHOR: J.John Park
@STORY 
	The game which is a winner who has the smallest counting
 */
public class NumberGolf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int target = (int) (Math.random() * 100 + 1), bet = 0, count = 0;
		while (true) {
			System.out.print("Enter the Integer number between 1 to 100 :");
			bet = sc.nextInt();
			if (bet == target) {
				System.out.println("Correct! Count:" + count);
			} else {
				System.out.println((bet > target) ? "Down!" : "Up!");
				count++;
			}
		}
	}
}
