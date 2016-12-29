package com.hanbit.matrix;

public class MrSmith {
	public static void main(String[] args) {
		String[][] name = {
		{"Good Morning! ", "Good Afternoon! ", "Good Evening! ", "Good Bye! "},
		{"Mr.","Mrs.","Miss."},
		{"Smith","Alex","Johnson"}};
		String people = "";
		people+=name[0][2] + "\n";
		people+=name[1][2];
		people+=name[2][2];
		System.out.printf("%s",people);
	}
}
