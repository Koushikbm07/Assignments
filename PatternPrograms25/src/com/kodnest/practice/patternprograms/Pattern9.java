package com.kodnest.practice.patternprograms;

public class Pattern9 {
//	Simple number program
	public static void main(String[] args) {
		int rows=5;
		int columns=5;
		int count=1;
		for(int i=1;i<=rows;i++) {
			count=1;
			for(int j=1;j<=i;j++) {
				System.out.print(count++);
			}
			System.out.println();
		}
	}

}
