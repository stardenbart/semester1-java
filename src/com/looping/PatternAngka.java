package com.looping;

public class PatternAngka {
    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < 10; i++){
            sum1 += i;
        }

        for(int i = 0; i < 10; ++i){
            sum2 += i;
        }

        System.out.println(sum1 + " " + sum2);
    }
}