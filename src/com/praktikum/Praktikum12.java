package com.praktikum;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Praktikum12 {
    public static void main(String[] args) {
        System.out.println("Program Praktikum ArrayList.");
        fungsiHariArray();

        System.out.println("===========================================================================================");

        hariArrayList();

        System.out.println("\nAkhir Program.");

    }

    private static void hariArrayList(){
        ArrayList<String> namaHari = new ArrayList<String>(12);
        namaHari.add("Minggu");
        namaHari.add("Senin");
        namaHari.add("Selasa");
        namaHari.add("Rabu");
        namaHari.add("Kamis");
        namaHari.add("Jumat");
        namaHari.add("Sabtu");

        boolean inputHari = false;
        int hariIni;
        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("\nMasukkan indeks hari (0-6): ");
                hariIni = input.nextInt();
                if(hariIni >= 0 && hariIni <= 6){
                    inputHari = true;
                }
                System.out.printf("Hari ini adalah hari %s\n", namaHari.get(hariIni));
                input.close();
            } catch (InputMismatchException e) {
                System.out.println("Input yang anda masukkan tidak sesuai indeks");
            } catch (IndexOutOfBoundsException ex){
                System.out.println("Validasi indeks salah.");
            }
        }while (!inputHari);
    }

    private static void fungsiHariArray(){
        String[] namaHari = {"Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"};

        int hari = -1;
        while(hari == -1) {
            try {
                System.out.print("Masukkan indeks hari (0-6): ");
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
    }

}
