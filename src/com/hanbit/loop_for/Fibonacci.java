package com.hanbit.loop_for;

/**
@FILE  : SeriesFibonacci.java
@DATE  : 2016. 12. 26.
@AUTHOR: J.John Park
@STORY
	Fibonacci Sequence
	1, 1, 2, 3, 5, 8, 13, 21, 34, 55...
 */
public class Fibonacci {
	public static void main(String[] args) {
		int a = 1, b = 1, c = 0, sum = 0;
		for(int i=3;;) {
			System.out.println(a + "," + b + "," + c + "," + sum);
			c = b + a;
			sum += c;
			a = b;
			b = c;
			i++;
			if(i>10)
				break;
		}
		System.out.printf(
				  "======================================\n"
				+ "1, 1, 2, 3, 5, 8, 13, 21, 34, 55의 합 \n"
				+ "======================================\n"
				+ "%d \n"
				+ "======================================",
				sum);
	}
}
