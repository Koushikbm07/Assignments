package com.kodnest.practice.patternprograms;

public class Pattern1 {
//	Pyramid Program
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++) {
			for(int k=0;k<n-1-i;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}

	

}
}
