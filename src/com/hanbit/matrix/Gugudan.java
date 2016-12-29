package com.hanbit.matrix;

public class Gugudan {
	public static void main(String[] args) {
		int i;
		for(i=2; i<10; i++) {
			for(int j=2; j<6; j++) {
				System.out.printf("%dX%d=%d\t",j,i,i*j);
			}
			System.out.println();
		}
		System.out.println();
		for(i=2; i<10; i++) {
			for(int j=6; j<10; j++) {
				System.out.printf("%dX%d=%d\t",j,i,i*j);
			}
			System.out.println();
		}
	}
}
