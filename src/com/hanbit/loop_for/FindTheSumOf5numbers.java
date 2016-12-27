package com.hanbit.loop_for;

import java.util.Scanner;

public class FindTheSumOf5numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int count=0; count<5; count++) {
			System.out.print("Enter the number:");
			int n = sc.nextInt();
			sum += n;
		}
		System.out.println("SUM: "+sum);
	}
}
