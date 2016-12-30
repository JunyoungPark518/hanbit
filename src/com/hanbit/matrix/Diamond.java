package com.hanbit.matrix;

import java.util.Scanner;

/*
0    0    1    0    0   
0    2    3    4    0   
5    6    7    8    9   
0    10    11    12    0   
0    0    13    0    0
 * */
public class Diamond {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int len=0;
        while(true) {
        	if(len%2!=0) {
        		break;
        	} else {
        		System.out.print("Insert odd number:");
        		len = sc.nextInt();
        	}
        }
        int col=len, row=len, val=0, start=0, end=0, fixed=3; //배열에 저장할 변수
        int[][] arr = new int[ col][ row];
        start=end=len/2; //열의 끝 위치
        for(int i=0; i<col; i++) {
        	for(int j=0; j<row; j++) {
        		arr[i][j] = (start<=i+j && end*fixed>=i+j && i>=j-start && j>=i-end) ? ++val : 0;
        		System.out.printf("%d\t",arr[i][j]);
        	}
        	System.out.println();
        }
    }
}
