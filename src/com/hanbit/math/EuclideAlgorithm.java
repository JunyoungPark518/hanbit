package com.hanbit.math;

import java.util.Scanner;

public class EuclideAlgorithm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer number");
		int number1 = sc.nextInt(), number2 = 0, quota = 0, remain = 0, lcm = 0, gcd = 0, temp1 = 0, temp2 = 0;
		System.out.println("Enter the comparasion integer number ");
		number2 = sc.nextInt();
		temp1 = number1;
		temp2 = number2;
		if (number1 >= number2) {
			while(true) {
				quota = number1 / number2; 
				remain = number1 % number2;
				number1 = number2;
				number2 = remain;
				if(remain==0) {
					gcd = number1;
					break;
				}
			}
			System.out.printf("Greatest Common Divisor:%d\n", gcd);
			lcm = (int) (temp1 * temp2 / gcd);
			System.out.printf("Least Common Multiple:%d", lcm);
		} else {
			number1 = temp2;
			number2 = temp1;
			while(true) {
				quota = number1 / number2; 
				remain = number1 % number2;
				number1 = number2;
				number2 = remain;
				if(remain==0) {
					gcd = number1;
					break;
				}
			}
			System.out.printf("Greatest Common Divisor:%d\n", gcd);
			lcm = (int) (temp1 * temp2 / gcd);
			System.out.printf("Least Common Multiple:%d", lcm);
		}
	}
}
