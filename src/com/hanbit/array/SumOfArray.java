package com.hanbit.array;

import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("덧셈하려는 숫자를 입력하세요. 단, 5개까지만 가능");
		int[] arr = new int[5];
		int sum = 0, i = 0; String str = ""; 
		for(; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			sum+=arr[i];
			str += (i!=arr.length-1) ? arr[i] + "+" : arr[i] + "=" + sum; 
		}
		System.out.printf(str);
	} 
}
