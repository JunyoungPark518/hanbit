package com.hanbit.loop_for;

import java.util.Scanner;

public class InputGugudan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("원하시는 정수를 입력해주세요.");
			int n = sc.nextInt();
			if(n==-1) {
				break;
			}
			for(int i=1; i<10; i++) {
				System.out.println(n + " * " + i + " = " + n*i);
			}
		}
	}
}
