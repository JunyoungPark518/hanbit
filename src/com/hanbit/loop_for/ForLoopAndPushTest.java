package com.hanbit.loop_for;

import java.util.Scanner;

public class ForLoopAndPushTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = 0, input2 = 0;
		System.out.println("Print the multiply function");
		System.out.print("Input the first integer number:");
		input1 = sc.nextInt();
		System.out.print("Input the second integer number:");
		input2 = sc.nextInt();
		
		for(int i=1; i<=input1; i++){
			for(int j=1; j<=input2; j++) {
				System.out.print(i + " * " + j + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
	}
}
