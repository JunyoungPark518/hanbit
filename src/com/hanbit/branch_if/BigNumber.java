package com.hanbit.branch_if;

import java.util.Scanner;

public class BigNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("A 값을 입력하세요.");
		int a = scan.nextInt();
		System.out.println("B 값을 입력하세요");
		int b = scan.nextInt();
		System.out.println("C 값을 입력하세요");
		int c = scan.nextInt();
		// 가장 큰 값부터 작은 순으로 나열하는 statement 를 완성하시오
		// 예를 들어, a=4, b=7, c=1 을 입력했다면.. 7,4,1 이 되겠습니다
		int newa = 0, newb = 0, newc = 0;
		if(a>b && a>c) {
			newa = a;
			if(b>c) {
				newb = b;
				newc = c;
			} else {
				newb = c;
				newc = b;
			}
		} else if(b>a && b>c) {
			newa = b;
			if(a>c) {
				newb = a;
				newc = c;
			} else {
				newb = c;
				newc = a;
			}
		} else if(c>a && c>b) {
			newa = c;
			if(a>b) {
				newb = a;
				newc = b;
			} else {
				newb = b;
				newc = a;
			}
		}
		System.out.println("A:" + a + ", B:" + b + ", C:" + c);
		System.out.println(newa + ", " + newb + ", " + newc);
	}
}
