package com.hanbit.loop_while;

import java.util.Scanner;

/**
@FILE  : ReportCard.java
@DATE  : 2016. 12. 23.
@AUTHOR: J.John Park
@STORY
	한 학생의 점수들을 입력받고 총 점수 및 평균 점수를 환산하여 등급을 매기는 프로그램을 작성.
	점수를 입력받는 부분에서 -1을 입력받게 되면 프로그램이 중지되며, 기존에 입력받은 값들을 토대로 결과를 출력.
 */
public class ReportCard {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 0, total = 0, average = 0, subjects = 0;
		String name = "";
		System.out.print("Name:");
		name = sc.next();
		while(true) {
			System.out.println("If you want to stop, Type -1");
			System.out.print("Score:");
			score = sc.nextInt();
			if(score == -1) {
				break;
			}
			total = total + score;
			subjects++;
		}
		average = total / subjects;
		char grade = 0;
		if(average >= 90){
			grade = 'A';
		} else if(average >= 80) {
			grade = 'B';
		} else if(average >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		System.out.println("\n\nName:" + name);
		System.out.println("Subjects:" + subjects);
		System.out.println("Total:" + total);
		System.out.println("Average:" + average);
		System.out.println("Grade:" + grade);
	}
}
