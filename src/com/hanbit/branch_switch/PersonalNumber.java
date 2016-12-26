package com.hanbit.branch_switch;

import java.util.Scanner;

public class PersonalNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String gender = "", ssn = "";
		boolean endloop = true;
		while (endloop) {
			System.out.print("주민번호를 입력해주세요:");
			ssn = sc.next();
			char ch = ssn.charAt(7);
			switch (ch) {
				case '1':
				case '3':
					gender = "남자";
					endloop = false;
					break;
				case '2':
				case '4':
					gender = "여자";
					endloop = false;
					break;
				case '5':
				case '6':
					gender = "외국인";
					endloop = false;
					break;
				case '7':
				case '8':
				case '9':
				case '0':
					System.out.println("올바른 주민번호를 입력해주세요.");
				default:
					System.out.println("다시 입력하세요.");
			}
		}
		System.out.println("위 사람은 '" + gender + "' 입니다.");
	}
}
