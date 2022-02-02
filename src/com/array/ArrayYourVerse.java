package com.array;
import java.util.*;
public class ArrayYourVerse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Memasukkan Nilai Oleh User ke Array.");
        batas(); batas();

        int nilai;
        System.out.print("Masukkan panjang array: ");
        nilai = input.nextInt();
        int[] nilaiArray = new int[nilai];



        inputArray(nilaiArray, nilai);

        input.close();
    }

    private static void batas(){
        System.out.println("==========================================================================================");

    }

    private static void inputArray(int[] a, int nilai){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai array: ");
        for(int i = 0; i < nilai; i++){
            a[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(a));

        input.close();
    }
}
