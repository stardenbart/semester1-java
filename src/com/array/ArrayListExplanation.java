package com.array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListExplanation {
    public static void main(String[] args){
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("Jokowi");
        nama.add("Prabowo");
        nama.add("Habibie");
        nama.add("Soekarno");

        System.out.println(nama);

        Scanner input= new Scanner(System.in);
        int[] nilai = {12, 13, 14, 15,16};
        System.out.println("Panjang array tersebut adalah: " + nilai.length);

        for(int l = 0; l < 5; l++){
            System.out.print(nilai[l] + " ");
        }

        System.out.println("\nProgram Mempelajari Sistemasi Array");

        int pjgArray, sum = 0;
        System.out.print("Masukkan panjang array: ");
        pjgArray = input.nextInt();
        int[] bilangan = new int[pjgArray];

        System.out.println(Arrays.toString(bilangan));

        for(int i = 1; i <= pjgArray; i++){
            System.out.print("Masukkan indeks ke-" + i + " = ");
            int k = input.nextInt();
            sum += k;
        }
        System.out.println("Jumlah data adalah: " + sum);
        System.out.println("Rata-rata data adalah: " + (float)sum/pjgArray + nama.get(0) + nama.size());

        input.close();
    }
}
