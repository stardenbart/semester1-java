package com.looping;

public class PatternAWithLoops {
    public static void main(String[] args) {
        System.out.println("Program Pattern.");

        for(int i = 1; i <= 6; i++) {
            System.out.println();
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
        }
    }
}
