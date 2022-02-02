package com.array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayExplanation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {5, 1, 0, 1, 7, 9};

        for(int i = 0; i < array.length; i++){
            System.out.println("Array indeks ke-" + i + ": " + array[i]);
        }

        System.out.println();
        cekMaxMin(array);

        System.out.println();
        eachLooping(array);

        System.out.println();
        System.out.println("Berikut pengubahan Integer ke String: ");
        System.out.println(Arrays.toString(array));

        System.out.println("=============================================");

        System.out.print("Masukkan panjang array nama: ");
        int name = input.nextInt();
        String[] nama = new String[name];

        for(int i = 0; i < nama.length; i++){
            System.out.print("Masukkan nama: ");
            String arrayNama = input.next();
            nama[i] = arrayNama;
        }

        System.out.println();
        System.out.println("Hasil array sebagai berikut: ");

        for(int i = 0; i < nama.length; i++){
            System.out.println((i + 1) + ". " + nama[i]);
        }

        System.out.println();
        System.out.println("Berikut pengubahan ke String: ");
        System.out.println(Arrays.toString(nama));
        System.out.println("=============================================");

        System.out.println("Akhir Program.");

        input.close();
    }

    private static void cekMaxMin(int[] a){
        int max = a[0], min = a[0];
        for(int cek : a){
            if (cek < min){
                min = cek;
            }else if(cek > max){
                max = cek;
            }
        }
        System.out.println("Nilai max nya adalah: " + max);
        System.out.println("Nilai min nya adalah: " + min);
    }

    private static void eachLooping(int[] a){
        System.out.println("Looping khususon untuk collections.");

        // for each looping untuk array.
        for(int angka : a){
            System.out.println(angka + " Mudah BANGGED!");
        }
    }
}
