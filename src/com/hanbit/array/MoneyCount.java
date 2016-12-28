package com.hanbit.array;

import java.util.Scanner;

public class MoneyCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int[] count = new int[8];
		int remain = 0;
		System.out.println("금액을 입력하세요:");
		int input = sc.nextInt();
		for(int i=0; i<money.length; i++) {
			if(input>money[i]) {
				count[i] = input/money[i];
				remain = input%money[i];
				input = remain;
			} 
			System.out.printf("    %d원:\t%d개\n",money[i],count[i]);
		}
		System.out.println(input + "원 절삭");
	}
}
