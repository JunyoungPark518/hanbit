package com.hanbit.loop_while;

import java.util.Scanner;

/**
@FILE  : SeriesInput.java
@DATE  : 2016. 12. 23.
@AUTHOR: J.John Park
@STORY
	-1을 입력하면 프로그램이 종료되고 다른 정수를 입력하면 계속 더해지는 프로그램을 구현하라.
 */
public class SeriesInput {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum = 0, i = 0;
		String str = "0";
		System.out.println("If you want to stop, Type -1");
		while (true) {
			System.out.print("Type Number:");
			i = s.nextInt();
			if (i < 0) {
				str = str + "-" + Integer.toString(Math.abs(i));
			} else {
				str = str + "+" + Integer.toString(i);
			}
			sum = sum + i;
			if (i == -1) {
				System.out.println("The program is terminated.");
				break;
			}
			System.out.println(str + "=" + sum);
		}
	}
}
