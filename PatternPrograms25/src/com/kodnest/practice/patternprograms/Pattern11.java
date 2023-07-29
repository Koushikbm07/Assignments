package com.kodnest.practice.patternprograms;

public class Pattern11 {
//	Binary Number Pattern in Java
	public static void main(String[] args) {
		
		int rows=5;
		int columns=5;
		for (int i = 1; i <= rows; i++) 
        {
            int num;  
            if(i%2 == 0) {
                num = 0;
                for (int j = 1; j <= rows; j++)
                {
                    System.out.print(num);   
                    num = (num == 0)? 1 : 0;
                }
            }
            else
            {
                num = 1; 
                for (int j = 1; j <= rows; j++)
                {
                    System.out.print(num);
                      
                    num = (num == 0)? 1 : 0;
                }
            } 
            System.out.println();
        }
	}
}
