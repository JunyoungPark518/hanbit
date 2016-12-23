package com.hanbit.branch_if;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0, result = 0;
		String opcode = "";
		System.out.println("=== Calculator ===");
		System.out.print("First Number:");
		a = sc.nextInt();
		System.out.print("Opcode:");
		opcode = sc.next();
		System.out.print("Second Number:");
		b = sc.nextInt();
		if(opcode.equals("+")) {
			result = a+b;
		} else if(opcode.equals("-")) {
			result = a-b;
		} else if(opcode.equals("*")) {
			result = a*b;
		} else if(opcode.equals("/")) {
			if(b==0) {
				System.out.println("0으로 나눌 수 없습니다.");
				return;
			} else {
				result = a/b;
			}
		} else if(opcode.equals("%")) {
			result = a%b;
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		System.out.println("Result:" + result);
		
		
	}
}