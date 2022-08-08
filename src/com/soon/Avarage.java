package com.soon;

import java.util.Scanner;

public class Avarage {
    public static void main(String[] args) {
        System.out.print("\nMulai Program\n");
        System.out.print("\nPemrograman Data Hasil Rata-Rata.");

        rumusAvarage();

        System.out.println("\nAkhir Program");
    }

    private static void rumusAvarage(){
        Scanner input = new Scanner(System.in);

        int n;
        double data;
        double sum = 0;

        System.out.print("\nMasukkan banyaknya data: ");
        n = input.nextInt();
        System.out.println();

        for(int i = 1; i <= n; i++){
            System.out.print("Masukkan nilai data ke-" + i + ": ");
            data = input.nextDouble();

            sum += data;
        }
        double avarage = sum/n;
        System.out.print("\nHasil rata-ratanya adalah: " + avarage + "\n");
    }

}
