package com.hanbit.math;

import java.util.Scanner;

/**
@FILE  : EuclideAlgorithm.java
@DATE  : 2016. 12. 28.
@AUTHOR: J.John Park
@STORY
	Calculate the Least Common Multiple and Greatest Common Divisor
 */
public class EuclideAlgorithm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2 integer number with comparasion");
		int number1 = sc.nextInt(), number2 = 0, remain = 0, lcm = 0, gcd = 0, temp1 = 0, temp2 = 0;
		number2 = sc.nextInt();
		if(number1 >= number2) {
			temp1 = number1;
			temp2 = number2;
		} else {
			temp2 = number1;
			temp1 = number2;
		}
		while (true) {
			remain = temp1 % temp2;
			temp1 = temp2;
			temp2 = remain;
			if (remain == 0) {
				gcd = temp1;
				break;
			}
		}
		lcm = (int) (number1 * number2 / gcd);
		System.out.printf("Greatest Common Divisor:%d\nLeast Common Multiple:%d", gcd, lcm);
	}
}
