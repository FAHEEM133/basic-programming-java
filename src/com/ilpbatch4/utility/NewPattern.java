package com.ilpbatch4.utility;

public class NewPattern {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int input = 4;
        PrintPattern(input);
    }

    private static void PrintPattern(int rows) {

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
