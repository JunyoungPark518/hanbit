package com.hanbit.branch_switch;

import java.util.Scanner;
/**
@FILE  : ShowMonth.java
@DATE  : 2016. 12. 23.
@AUTHOR: J.John Park
@STORY
	연도를 4로 나눈값이 0 이라면 윤년일 수 있다.
	그러나 해당 연수가 100으로 나누어 떨어지면 평년이다.
	2000년은 4로 나눈값이 0 이라서 윤년일 수 있는데..
	다시 이 값이 100으로 나눠 떨어지면 평년이다.
	평년이라 해도 다시 400으로 나눠 떨어지는 연도는 윤년이다.
 */
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
			if(year % 4 == 0 && year % 100 != 0) {
				yearCheck = "윤년";
				day = 29;
			} else if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
				yearCheck = "윤년";
				day = 29;
			} else {
				yearCheck = "평년";
				day = 28;
			}
			/*if (year % 400 == 0) {
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
			}*/
			System.out.println(year + "-" + month + "월은 " + day + "일까지 있고, " + yearCheck + "입니다.");
		default:	
		}
	}
}
