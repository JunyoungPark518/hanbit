package com.hanbit.math;

import java.util.Scanner;

public class EuclideAlgorithm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수 1개를 입력하세요.");
		int number1 = sc.nextInt();
		System.out.println("양의 정수 1개를 더 입력하세요.");
		int number2 = sc.nextInt();
		if (number1 >= number2) {
			EuclideAlgorithm eu = new EuclideAlgorithm(number1, number2);
		} else {
			EuclideAlgorithm eu = new EuclideAlgorithm(number2, number1);
		}
	}

	public EuclideAlgorithm(int big, int small) {
		calc(big, small);
	}

	public void calc(int number1, int number2) {
		int quota = number1 / number2, remain = number1 % number2;
		System.out.println(number1 + " = " + number2 + "*" + quota + "+" + remain);
		number1 = number2;
		number2 = remain;
		if (remain != 0) {
			calc(number1, number2);
		} else {
			return;
		}
	}
}
