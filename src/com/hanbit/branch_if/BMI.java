package com.hanbit.branch_if;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double height = 0.0, weight = 0.0, age = 0.0, bmi = 0.0;
		System.out.print("나이를 입력하세요:");
		age = sc.nextInt();
		if (age<3) {
			System.out.println("BMI 지수의 참고치 정보는 2세 이상부터 제공됩니다.");
			System.out.println("정확한 수치를 입력해주세요.\n\n");
			return;
		} 
		
		System.out.print("몸무게를 입력하세요:");
		height = sc.nextDouble();
		System.out.print("키를 입력하세요:");
		weight = sc.nextDouble() / 100;
		bmi = height / (weight * weight);
		String print = "";
		if(bmi>30) {
			print = "고도비만";
		} else if(bmi>25) {
			print = "비만";
		} else if(bmi>23) {
			print = "과체중";
		} else if(bmi>18.5) {
			print = "정상";
		} else {
			print = "저체중";
		}
		
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("나의 신체질량지수(BMI) " + Float.parseFloat(df.format(bmi)) + "(" + print + ")");			
		
	}
}
