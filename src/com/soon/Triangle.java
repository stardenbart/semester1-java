package com.soon;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        System.out.print("Mulai Program\n");

        System.out.print("\nProgram Rumus Segitiga.");
        Scanner input = new Scanner(System.in);
        System.out.print("\n\t0. Keluar" +
                "\n\t1. Luas Segitiga" +
                "\n\t2. Keliling Segitiga\n");
        System.out.print("Masukkan pilihan anda: ");
        int pilihan = input.nextInt();

        while(pilihan != 0){
            switch (pilihan) {
                case 1 -> {
                    System.out.print("\nMasukkan data alas segitiga: ");
                    double alas = input.nextDouble();
                    System.out.print("Masukkan data tinggi segitiga: ");
                    double tinggi = input.nextDouble();
                    System.out.println();
                    luasSegitiga(alas, tinggi);
                    System.out.println();
                }
                case 2 -> {
                    System.out.print("\nMasukkan nilai sisi ke-1: ");
                    double sisi1 = input.nextDouble();
                    System.out.print("Masukkan nilai sisi ke-2: ");
                    double sisi2 = input.nextDouble();
                    System.out.print("Masukkan nilai sisi ke-3: ");
                    double sisi3 = input.nextDouble();
                    System.out.println();
                    kelilingSegitiga(sisi1, sisi2, sisi3);
                    System.out.println();
                }
            }
            System.out.println("Mulai lagi program, input 0 untuk keluar.");
            System.out.printf("\t0. Keluar" +
                    "\n\t1. Luas Segitiga" +
                    "\n\t2. Keliling Segitiga\n");
            System.out.print("Masukkan pilihan anda: ");
            pilihan = input.nextInt();
        }


        System.out.print("\nAkhir Program");

    }

    private static void luasSegitiga(double alas, double tinggi){
        double luas = (alas * tinggi)/2;

        System.out.print("Luas segitiga dengan alas " + alas + " cm dan tinggi " + tinggi + " cm.");
        System.out.println("\nadalah sebagai berikut: " + luas);

    }

    private static void kelilingSegitiga(double a, double b, double c){
        double keliling = a + b + c;
        System.out.print("Keliling segitiga dengan panjang sisi " + a + ", " + b + ", " + c + ".");
        System.out.println("\nadalah sebagai berikut: " + keliling);
    }
}
