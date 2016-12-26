package com.hanbit.loop_while;

public class SeriesSwitch {
	public static void main(String[] args) {
		int i = 0, sum = 0, sw = 0;
		while(true) {
			i++;
			if(i%2==0) {
				sw= -i;
			} else {
				sw = i;
			}
			sum+=sw;
			if(i==100) {
				break;
			}
		}
		
		System.out.printf(
				  "====================================\n"
				+ "1-2+3-4+5-6+7... +99-100까지의 합계 \n"
				+ "====================================\n"
				+ "%d \n"
				+ "====================================",
				sum);
	}
}
