package com.hanbit.loop_for;

import java.util.Scanner;

public class WhileBreak {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("원하시는 정수를 입력해주세요:");
		int i = sc.nextInt();
		int count = 1;
		String word = "Hello World!";
		while(count<=10) {
			System.out.println(word);
			if(i==count) { // count보다 작은 정수의 i를 입력하면 여기서 멈춤
				break;
			} else { // 그렇지 않으면(i가 count보다 크면) 10번 while loop를 순회하고 멈춤
				count++;
			}
		}
	}
}
