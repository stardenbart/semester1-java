package com.array;

import java.util.Scanner;

public class Algoritma {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = 1;
        int b = 0;
        int c = 0;
        System.out.print("Input nilai N = ");
        int N = input.nextInt();

        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(a + " ");
                c = a;
                a = b;
                b = c;
            }
            System.out.println();
        }
        input.close();
    }
}
