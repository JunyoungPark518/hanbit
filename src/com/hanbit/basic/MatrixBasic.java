package com.hanbit.basic;

public class MatrixBasic {
	public static void main(String[] args) {
		int[][] matrix = new int[3][3];
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				System.out.printf("[%d,%d]",i,j);
			}
			System.out.println();
		}
	}
}
