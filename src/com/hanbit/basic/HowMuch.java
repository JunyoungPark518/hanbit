package com.hanbit.basic;

import java.util.Scanner;

public class HowMuch {
	public static void main(String[] args) {
		// Variable Declaration
		Scanner sc = new Scanner(System.in);
		// Value Assignment
		int price=0, count=0, total=0, dc=0, percent=0; // CPU에게는 만드는게 제일 어렵기 때문에 한번에 선언 및 생성해주는 것이 좋음
		System.out.println("얼마에요?");
		price = sc.nextInt();
		System.out.println(price + "원 입니다.");
		System.out.println("몇개 드릴까요?");
		count = sc.nextInt();
		System.out.println(count + "개 주세요");
		total = price * count;
		System.out.println("금액은 " + total + "원 입니다.");
		System.out.println("비싸요, 깎아주세요.");
		System.out.println("얼마나 깎아 드릴까요?");
		percent = sc.nextInt();
		System.out.println(percent+ "% 깎아주세요!");
		// Operation
		if(percent<=10) {
			 dc = total - (total*percent)/100;
			System.out.println("총 금액은 " + dc + "원 입니다.");
		}
		else {
			System.out.println("안 남아서 안 팔아요.");
		}
		
	}
}