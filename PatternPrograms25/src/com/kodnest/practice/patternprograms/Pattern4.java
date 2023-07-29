package com.kodnest.practice.patternprograms;

public class Pattern4 {
//	Reversed Pyramid Star Pattern
	public static void main(String[] args) {
		
		int n=5;
		for(int i=0;i<n;i++) {
			for(int k=0;k<=i;k++) {
				System.out.print(" ");
			}
			for(int j=n-i;j>=1;j--) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	
	}

}
