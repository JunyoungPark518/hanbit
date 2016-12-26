package com.hanbit.loop_for;

/**
@FILE  : SeriesOneToFive.java
@DATE  : 2016. 12. 26.
@AUTHOR: J.John Park
@STORY
	1부터 10까지의 합 구하기(diff=1) to use for loop

 */
public class Series1To10 {
	public static void main(String[] args) {
		int i = 0, sum = 0;
		for(i=1; i<=10; i++) { // init, limit, step
			sum += i;
		}
		System.out.println("합은 " + sum + "입니다.");
	}
}
