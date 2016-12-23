package com.hanbit.branch_if;

import java.util.Scanner;

/*
To.개발자님께
초단위로 알려주는 시험이 있는데
이 값을 몇시간 몇분 몇초인지 계속 계산해야 해서요.
혹시 초값을 입력받으면 자동으로 계산되는 프로그램을 
만들어 줄 수 있을까요?
그러니까 500초 이면 뭐 몇시간 몇분 몇초라고 보여주면 좋겠죠.
*/

public class TimeCalc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = 0, min = 0, sec = 0, totalsec = 0;
		System.out.println("초값을 입력해주세요:");
		totalsec = sc.nextInt();
		if (totalsec / 3600 >= 1) {
			hour = totalsec / 3600;
			min = (totalsec - hour * 3600) / 60;
			sec = totalsec - hour * 3600 - min * 60;
			System.out.println("총 " + hour + "시 " + min + "분 "+ sec + "초 입니다");
		}
		else if(totalsec / 60 >= 1) {
			min = totalsec / 60;
			sec = totalsec - min*60;
			System.out.println("총 " + hour + "시 " + min + "분 "+ sec + "초 입니다");
		} else {
			sec = totalsec;
			System.out.println("총 " + hour + "시 " + min + "분 "+ sec + "초 입니다");
		}
	}
}
