package com.program;

import java.util.Scanner;

public class ProgramMatematikaSMA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Menentukan Nilai Hasil Pangkat dan Faktorial");
        System.out.print("Mulai program?" +
                "\nInput (1)YES (0) NO: ");
        int data = input.nextInt();

        batas();

        while(data == 1) {
            System.out.print("Masukkan bilangan: ");
            int nilai = input.nextInt();

            System.out.print("Masukkan pangkat bilangan: ");
            int pangkat = input.nextInt();

            int hasil = nilaiPangkat(nilai, pangkat);
            System.out.println("Hasil perpangkatan dari " + nilai + " pangkat " + pangkat + ": " + (long)hasil);
            System.out.println("Hasil rekursif perpangkatan: " + nilaPangkat_(nilai, pangkat));

            batas();

            System.out.println("SubProgram Faktorial");
            System.out.print("Masukkan bilangan: ");
            int nilai1 = input.nextInt();

            int hasil1 = nilaiFaktorial(nilai1);
            System.out.println("Hasil faktorial dari " + nilai1 + " adalah: " + (long)hasil1);
            System.out.println("Hasil faktrial dari rekursif: " + factorial(nilai1));

            batas();

            System.out.println("SubProgram Permutasi Nilai Faktorial");
            System.out.print("Masukkan nilai: ");
            int x = input.nextInt();
            System.out.print("Masukkan nilai r: ");
            int r = input.nextInt();
            int hasilPermutasi = permutasiNilai(x, r);
            System.out.println("Hasil permutasi nilai tersebut adalah: " + hasilPermutasi);

            batas();

            System.out.print("Mulai ulang program?" +
                    "\nInput (1)YES (0)NO: ");
            data = input.nextInt();
        }
        batas();

        System.out.println("Akhir Program.");
        input.close();

    }

    private static void batas(){
        System.out.println("========================================================");
    }

    private static int nilaiPangkat(int a, int b){
        int x = 1;
        for(int i = 0; i < b; i++){
            x *= a;
        }
        return x;
    }

    private static int nilaPangkat_(int a, int b){
        if(b == 1){
            return a;
        }else{
            return a * nilaPangkat_(a, b-1);
        }
    }

    private static int nilaiFaktorial(int a){
        int x = 1;
        for(int i = 1; i <= a; i++){
            x *= i;
        }
        return x;
    }

    private static int permutasiNilai(int a, int r){
        int hasil = nilaiFaktorial(a) / nilaiFaktorial(a - r);
        return hasil;
    }

    private static int factorial(int n){
        if(n == 0){
            return 1;
        }else{
            return n * factorial(n - 1);
        }
    }
}
