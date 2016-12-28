package com.hanbit.array;

/**
@FILE  : LottoDraw.java
@DATE  : 2016. 12. 27.
@AUTHOR: J.John Park
@STORY
	Collect the lotto, 1~45 random number, the number of ball is 6. 
	if a ball was submitted, except for this ball from list.
	Print is [5,23,12,40,19,22]
 */
public class LottoDraw {
	public static void main(String[] args) {
		int i = 0, j = 0, draw = 0;
		int[] ball = new int[6];
		int temp = 0;
		int cmp = 0;
		String balls = "";
		for(;i<ball.length;i++) {
			ball[i] = (int)(Math.random()*45+1);
			for(j=0; j<=i; j++) {
				if(ball[i]!=ball[j]) {
					cmp++;
				}
			}
			if(cmp==0) {
				ball[i] = temp;
			}
		}
		System.out.printf("[%s]",balls);
	}
}
