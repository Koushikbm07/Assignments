package com.kodnest.practice.patternprograms;

public class Pattern18 {

	public static void main(String[] args) {
		
		int  n=5;
		for(int i=1;i<=n;i++) {
			int count=1;
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(n-i)*2+1;j++) {
			System.out.print(count++);
			}
		System.out.println();
		}
		
	}

}
