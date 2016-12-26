package com.hanbit.loop_while;

public class ContinueDemo {
	public static void main(String[] args) {
		int i=0, sum = 0;
		while(i<100) {
			sum += i;
			i++;
		}
		System.out.printf("1부터 100까지의 합: %d", sum);
	}
}
