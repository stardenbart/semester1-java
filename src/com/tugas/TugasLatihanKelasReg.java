package com.tugas;
import java.util.*;
public class TugasLatihanKelasReg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriksA = new int[10][10];
        int[][] matriksB = new int[10][10];
        int[][] hasil = new int[10][10];
        int m, n;
        System.out.println("Program Pembagian Matriks");
        System.out.println("===========================================");

        System.out.print("Masukkan banyak baris Matriks: ");
        m = input.nextInt();
        System.out.print("Masukkan banyak kolom Matriks: ");
        n = input.nextInt();
        System.out.println("===========================================");

        dataMatriks(matriksA, m, n);

        System.out.println("===========================================");

        dataMatriks(matriksB, m, n);

        System.out.println("===========================================");


        penjumlahanMatriks(matriksA, matriksB, hasil, m, n);
        System.out.println("Akhir Program.");

        input.close();
    }

    public static void penjumlahanMatriks(int[][] matriksA, int[][] matriksB, int[][] hasil, int m, int n){
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                hasil[i][j] = matriksA[i][j] / matriksB[i][j];
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void dataMatriks(int[][] matriks, int m, int n){
        System.out.println("Masukkan elemen matriks ke ");
        Scanner put = new Scanner(System.in);
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                matriks[i][j] = put.nextInt();
            }
        }
        put.close();
    }
}
