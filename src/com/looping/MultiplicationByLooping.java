package com.looping;
import java.util.Scanner;
public class MultiplicationByLooping {
    public static void main(String[] args) {
        System.out.println("          Multiplication Program");
        Scanner input = new Scanner(System.in);

        for (int j = 1; j <= 9; j++) {
            System.out.printf("%4d" , j);
        }

        System.out.println("\n---------------------------------------------");

        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%4d" , i * j);
            }
            System.out.println();
        }

        input.close();
    }
}
