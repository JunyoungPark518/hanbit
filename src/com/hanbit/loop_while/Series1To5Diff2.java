package com.hanbit.loop_while;

public class Series1To5Diff2 {
	public static void main(String[] args) {
		int i = 1, sum = 0;
		while(i<=5) {
			sum+=i;
			i+=2;
		}
		System.out.println(sum);
	}
}
