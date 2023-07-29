package com.kodnest.practice.patternprograms;

public class Pattern8 {
//	Diamond Star Pattern
	public static void main(String[] args) {
	int rows=9;
	int l_spaces=rows/2;
	int Inner_space=1;
	
	for(int i=1;i<=rows;i++) {
		for(int j=1;j<=l_spaces;j++) {
			System.out.print(" ");
		}
		System.out.print("*");
		
		for(int m=1;m<=Inner_space;m++) {
			System.out.print(" ");
		}
		System.out.print("*");
		System.out.println();
		if(i<=rows/2) {
			l_spaces--;
			Inner_space+=2;
		}
		else {
			l_spaces++;
			Inner_space-=2;
		}
	}

	}

}
