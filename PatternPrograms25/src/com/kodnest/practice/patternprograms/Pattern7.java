package com.kodnest.practice.patternprograms;

public class Pattern7 {
//	 Sandglass Star Pattern
	public static void main(String[] args) {
		int rows=10;
		int spaces=1;
		int stars=rows/2;
		for(int i=1;i<=rows+1;i++) {
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=stars;k++) {
				System.out.print("* ");
			}
			if(i<=rows/2) {
				spaces++;
				stars--;
			}
			else{
				spaces--;
				stars++;
			}
			if(i!=rows/2)
			System.out.println();	
		}
	}
}
