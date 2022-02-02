package com.tugas;
import java.util.*;
public class TugasLatihan8 {
    public static void main(String[] args) {
        System.out.println("Program Menyimpan 5 Nama Beserta Hari Ulang Tahun.");
        System.out.println("=======================================================");
        Scanner input = new Scanner(System.in);
        String[] nama = new String[5];
        String[] bulan = new String[5];
        int[] tanggal = new int[5];
        int[] tahun = new int[5];

        getNama(nama);
        getTanggal(tanggal);
        getBulan(bulan);
        getTahun(tahun);
        getHasil(nama, tanggal, bulan, tahun);

        input.close();
    }

    private static void getNama(String[] nama) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < nama.length; i++) {
            System.out.print("Masukkan nama: ");
            String inputNama = input.next();
            nama[i] = inputNama;

            input.close();
        }
        System.out.println("=======================================================");

    }

    private static void getBulan(String[] bulan) {
        for (int i = 0; i < bulan.length; i++) {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan bulan Januari - Desember: ");
            String inputBulan = input.next();
            bulan[i] = inputBulan;

            input.close();
        }
        System.out.println("=======================================================");
    }

    private static void getTanggal(int[] tanggal) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < tanggal.length; i++) {
            System.out.print("Masukkan tanggal: ");
            int inputTanggal = input.nextInt();
            tanggal[i] = inputTanggal;

            input.close();
        }
        System.out.println("=======================================================");

    }

    private static void getTahun(int[] tahun) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < tahun.length; i++) {
            System.out.print("Masukkan tahun: ");
            int inputTahun = input.nextInt();
            tahun[i] = inputTahun;

            input.close();
        }
        System.out.println("=======================================================");

    }

    private static void getHasil(String[] nama, int[] tanggal, String[] bulan, int[] tahun) {
        System.out.println("Hasil data yang didapatkan sebagai berikut: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(nama[i] + ": " + tanggal[i] + " " + bulan[i] + " " + tahun[i]);
        }
    }

}