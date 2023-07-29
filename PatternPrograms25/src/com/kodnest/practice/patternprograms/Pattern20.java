package com.kodnest.practice.patternprograms;

public class Pattern20 {

	public static void main(String[] args) {
		
		int n=5;
		char ch='A';
		for(int i=1;i<=n;i++) {
			
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
			}
			ch+=2;
			System.out.println();
		}
	}

}
