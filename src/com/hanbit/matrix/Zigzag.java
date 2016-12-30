package com.hanbit.matrix;

import java.util.Scanner;

public class Zigzag {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Insert the number:");
        int length = sc.nextInt(); // 배열 길이
        int[][] arr = new int[length][length];
        int k = 1; // 넣을 값
        int flag = 1; // 스위치변수
        int i = 0; // 행
        int j = 0; // 열
        for(i=0;i<arr.length;i++) {
    		for(j=0; j<arr[i].length; j++) {
    			flag = (i%2==0) ? 1 : -1;
    			arr[i][j] = (i%2==0) ? i*length+k : i*length+flag*j+length;
    			k++;
    			System.out.printf("%d\t",arr[i][j]);
    		}
    		k-=length;
        	System.out.println();
        }


    }
}
