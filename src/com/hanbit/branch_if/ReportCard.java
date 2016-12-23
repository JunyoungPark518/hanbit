package com.hanbit.branch_if;

import java.util.Scanner;

public class ReportCard {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kScore = 0, eScore = 0, mScore = 0, total = 0, average = 0;
		System.out.print("Name:");
		String name = sc.next();
		System.out.print("Korean Score:");
		kScore = sc.nextInt();
		System.out.print("English Score:");
		eScore = sc.nextInt();
		System.out.print("Math Score:");
		mScore = sc.nextInt();
		
		total = kScore+eScore+mScore;
		average = total / 3;
		char grade = 0;
		if(average >= 90){
			grade = 'A';
		} else if(average >= 80) {
			grade = 'B';
		} else if(average >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		System.out.println("\n\nName:" + name);
		System.out.println("Total:" + total);
		System.out.println("Average:" + average);
		System.out.println("Grade:" + grade);
	}
}
