package com.hanbit.matrix;

public class MatrixDiff5 {
	public static void main(String[] args) {
		int[][] matrix = new int[5][5];
		int k=0;
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				k += 5;
				matrix[i][j] = k;
				System.out.printf("%d\t",matrix[i][j]);
			}
			System.out.println();
		}
		
	}
}
