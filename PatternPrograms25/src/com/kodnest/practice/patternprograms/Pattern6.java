package com.kodnest.practice.patternprograms;

public class Pattern6 {

	public static void main(String[] args) {
		int rows=9;
		int spaces=rows/2;
		int stars=1;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=stars;k++) {
				System.out.print("*");
			}
			if(i<=rows/2) {
				spaces--;
				stars++;
			}
			else{
				spaces++;
				stars--;
			}
			System.out.println();
		}
	}

}
