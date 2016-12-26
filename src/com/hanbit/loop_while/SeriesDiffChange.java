package com.hanbit.loop_while;

/**
@FILE  : SeriesDiffChange.java
@DATE  : 2016. 12. 26.
@AUTHOR: J.John Park
@STORY

 */
public class SeriesDiffChange {
	public static void main(String[] args) {
		int i=0, d=1, sum=1;
		
		while(true) {
			// 이 부분을 코딩하여 완성하시오.
			System.out.println(i + ", " + d + ", " + sum);
			i++;
			d+=i;
			sum+=d;
			if(i==19) {
				break;
			}
		}
		System.out.printf(
				  "======================================================\n"
				+ "1+2+4+7+11+16+22+... 증가하는 수열의 20번째 항까지 합 \n"
				+ "======================================================\n"
				+ "%d \n"
				+ "======================================================",
				sum);
	}
	// a2 = a1 + d1, a3 = a2 + d2, a4 = a3 + d3, a5 = a4 + d4
	// a3 = a2 + d2 = a1 + 1 + 2
	// a4 = a3 + d3 = a2 + d2 + d3 = a1 + 1 + 2 + 3,,,, 0+1+2+3
	// d++, 
}
