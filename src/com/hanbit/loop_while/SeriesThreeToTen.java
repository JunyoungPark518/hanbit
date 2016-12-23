package com.hanbit.loop_while;

/**
@FILE  : SeriesThreeToTen.java
@DATE  : 2016. 12. 23.
@AUTHOR: J.John Park
@STORY
	3부터 10까지의 합
 */
public class SeriesThreeToTen {
	public static void main(String[] args) {
		int init = 3, sum = 0;
		while (true) {
			sum = sum + init;
			if (init == 10) {
				break;
			}
			init = init + 1;
		}
		System.out.println("합은 " + sum + "입니다.");
	}
}
