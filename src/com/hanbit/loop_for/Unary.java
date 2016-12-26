package com.hanbit.loop_for;

/**
@FILE  : SeriesOneToFive.java
@DATE  : 2016. 12. 26.
@AUTHOR: J.John Park
@STORY
	1부터 5까지의 합 구하기(diff=1) to use for loop

 */
public class Unary {
	public static void main(String[] args) {
		int i = 0, sum = 0;
		for(i=1; i<6; i++) { // init, limit, step
			System.out.println("NUM: " + i);
			sum += i;
		}
		System.out.println("합은 " + sum + "입니다.");
	}
}
