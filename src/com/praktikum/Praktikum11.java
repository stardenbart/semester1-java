package com.praktikum;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Praktikum11 {
    public static void main(String[] args) {
        System.out.println("Program Menentukan Hari Sesuai Indeks yang Diinput User.");
        batas(); batas();

        String[] namaHari = {"Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"};

        int hari = -1;
        while(hari == -1) {
            try {
                System.out.print("\nMasukkan indeks hari (0-6): ");
                Scanner input = new Scanner(System.in);
                hari = input.nextInt();
                System.out.printf("Hari ini adalah hari %s\n", namaHari[hari]);
                input.close();
            } catch (InputMismatchException e) {
                System.err.println("Harap masukkan indeks integer.");
            } catch (ArrayIndexOutOfBoundsException ex){
                System.err.println("Indeks yang anda masukkan melebihi batas.");
            }
        }

        System.out.println("\nAkhir Program.");
    }

    private static void batas(){
        System.out.println("==================================================================================");
    }
}
