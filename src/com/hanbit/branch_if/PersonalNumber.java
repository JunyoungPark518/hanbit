package com.hanbit.branch_if;

import java.util.Scanner;

public class PersonalNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String gender = "", ssn = "";
		System.out.print("주민번호를 입력해주세요:");
		ssn = sc.next();
		char ch = ssn.charAt(7);
		if(ch=='7'||ch=='8'||ch=='9'||ch=='0') {
			System.out.println("다시 입력하세요.");
			main(null);
			return;
		} else if(ch=='1'||ch=='3') {
			gender = "남자";
		} else if(ch=='2'||ch=='4') {
			gender = "여자";
		} else if(ch=='5'||ch=='6') {
			gender = "외국인";
		} else {
			System.out.println("올바른 주민번호를 입력해주세요.");
		}
		System.out.println("위 사람은 '" + gender + "' 입니다.");
	}
}
