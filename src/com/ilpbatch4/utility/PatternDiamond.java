package com.ilpbatch4.utility;

public class PatternDiamond {
	public static void main(String[] args) {
	int input = 3;
	PrintPattern(input);

}


private static void PrintPattern(int rows) {
	
	for (int i = 1; i <= rows; i++) {
		for (int j = rows - i; j > 0; j--) {
			System.out.print(" ");
		}
		for (int j = 1; j <= i; j++) {
			System.out.print(j);
		}
		for (int j = i - 1; j > 0; j--) {
			System.out.print(j);
		}
		System.out.println();
	}
	rows=rows-1;
	for (int i = rows; i >= 1; i--) {
        for (int j = 0; j < (rows+1) - i; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) {
            System.out.print(j);
        }
        for (int j = i - 1; j >= 1; j--) {
            System.out.print(j);
        }
        System.out.println();
    	}
		
	}

}