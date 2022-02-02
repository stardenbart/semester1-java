package com.looping;

public class PatternBWithLoops {
    public static void main(String[] args) {
        System.out.println("Program Pattern Kedua.");

        for(int i = 0; i < 6; i++){
            System.out.println();
            for(int j = 1; (j <= 6-i); j++){
                System.out.print(j + " ");
            }
        }
    }
}
