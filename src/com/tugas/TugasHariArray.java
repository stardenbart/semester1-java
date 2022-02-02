package com.tugas;

import java.util.Scanner;

public class TugasHariArray {
    public static void main(String[] args) {
        System.out.println("Program Menentukan Hari Sesuai Indeks yang Diinput User.");
        batas(); batas();

        Scanner input = new Scanner(System.in);
        String[] namaHari = {"Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"};
        int hari = 1;

        System.out.println("\nHari ini adalah hari " + namaHari[hari]);

        batas();
        try {
            System.out.print("\nMasukkan indeks hari (0-6): ");
            int hariIni = input.nextInt();
            System.out.printf("Hari ini adalah hari %s\n", namaHari[hariIni]);
        }catch(Exception e){
            System.err.println("Indeks yang anda masukkan lebih dari muatan!");
        }

        System.out.println("\nAkhir Program.");

        input.close();
    }

    private static void batas(){
        System.out.println("==================================================================================");
    }
}
