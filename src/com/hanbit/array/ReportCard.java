package com.hanbit.array;

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
		int i = 0, total = 0, average = 0;
		int[] scorearr = new int[5];
		String[] subject = new String[5];
		char grade = 0;
		String name = "", subjects = "", scores = "", addedline = "";
		System.out.print("이름:");
		name = sc.next();
		System.out.println("그만 입력하려면 -1를 입력하세요");
		for(;i<5;i++) {
			System.out.print("과목명을 입력하세요:");
			subject[i] = sc.next();
			System.out.print(subject[i] + "점수:");
			scorearr[i] = sc.nextInt();
			if(scorearr[i] == -1) {
				break;
			}
			total = total + scorearr[i];
			subjects+=subject[i] + "\t|";
			scores+=scorearr[i] + "\t|";
			addedline+="========";
		}
		average = total / i;
		switch(average/10) {
		case 10 : case 9 :
			grade = 'A';
			break;
		case 8: 
			grade = 'B';
			break;
		case 7 :
			grade = 'C';
			break;
		default:
			grade = 'D';
			break;
				
		}
		System.out.printf(
				"=============================%s\n" +
				"이름\t\t|%s평균\t|학점\n" +
				"=============================%s\n"
				+"%s\t\t|%s%d\t|%c\n" +
				"=============================%s",
				addedline, subjects, addedline, name, scores, average, grade, addedline);
	}
}
