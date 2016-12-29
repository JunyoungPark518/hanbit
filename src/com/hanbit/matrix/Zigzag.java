package com.hanbit.matrix;

public class Zigzag {
    public static void main(String[] args) {
        int length = 5; // 배열 길이
        int[][] arr = new int[length][length];
        int k = 1; // 넣을 값
        int flag = 1; // 스위치변수
        int i = 0; // 행
        int j = 0; // 열
        for(i=0;i<arr.length;i++) {
    		for(j=0; j<arr[i].length; j++) {
    			arr[i][j] = k;
    			k++;
    			System.out.printf("%d\t",arr[i][j]);
    			if(i==1||i==3) {
    				
    			}
    		}
        	System.out.println();
        }


    }
}
