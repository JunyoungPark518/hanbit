package com.hanbit.branch_switch;

import java.util.Scanner;

public class ShowMonth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = 0, month = 0, day = 0;
		String yearCheck = "";
		System.out.println("Year:");
		year = sc.nextInt();
		System.out.println("Month:");
		month = sc.nextInt();
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;
			System.out.println(year + "-" + month + "월은 " + day + "일까지 있습니다.");
			break;
		case 4: case 6: case 9: case 11:
			day = 30;
			System.out.println(year + "-" + month + "월은 " + day + "일까지 있습니다.");
			break;
		case 2:
			if (year % 400 == 0) {
				yearCheck = "윤년";
				day = 29;
			} else if (year % 100 == 0) {
				yearCheck = "평년";
				day = 28;
			} else if (year % 4 == 0) {
				yearCheck = "윤년";
				day = 29;
			} else {
				yearCheck = "평년";
				day = 28;
			}
			System.out.println(year + "-" + month + "월은 " + day + "일까지 있고, " + yearCheck + "입니다.");
		default:	
		}
	}
}
