package com.program;

import java.util.Scanner;

public class ProgramTabelPerkalian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Tabel Perkalian");

        System.out.print("Mulai program? " +
                "1(YES) 0(NO): ");
        int data = input.nextInt();

        while(data == 1){
            System.out.print("Masukkan Bilangan: ");
            int n = input.nextInt();

            System.out.println("      Multiplication Table      ");
            for(int i = 1; i <= n; i++){
                System.out.printf("%4d", i);
            }

            System.out.println("\n--------------------------------------------------------");

            for(int j = 1; j <= n; j++){
                System.out.print(j + " | ");
                for(int i = 1; i <= n; i++){
                    System.out.printf("%4d", j * i);
                }
                System.out.println();
            }

            System.out.print("Mulai ulang program? " +
                    "1(YES) 0(NO): ");
            data = input.nextInt();
        }
        input.close();
    }
}
