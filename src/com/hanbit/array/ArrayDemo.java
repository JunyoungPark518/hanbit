package com.hanbit.array;

public class ArrayDemo {
	public static void main(String[] args) {
		int[]a = {9,45,150,71,136,105};
		int i=0;
//		System.out.printf("Array length:%d\n",a.length);
//		System.out.printf("Array 3번째 값:%d",a[2]);
		for(;i<a.length;i++) {
			System.out.printf("%d\t", a[i]);
		}
	}
}
