package com.praktikum;

import java.util.ArrayList;

public class Praktikum13 {
    public static void main(String[] args) {

        ArrayList<Double> kumpulanAngka = new ArrayList<Double>();

        for (int i = 0; i < 6; i++){
            double n = i/2.0;
            kumpulanAngka.add(n);
        }

        System.out.print("Kumpulan angka adalah: " + kumpulanAngka);

        for (int i = 0; i < kumpulanAngka.size(); i++){
            double n = (Double)kumpulanAngka.get(i);
            kumpulanAngka.set(i,Math.ceil(n)); //Angka dibulatkan ke atas
        }

        System.out.println("\nKumpulan angka adalah: " + kumpulanAngka);

        array2D();
    }

    private static void array2D(){
        int[][] array2D = {{0,0,0,0,0}, {0,0,0,0,0}};

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 5; j++){
                if(array2D[i][j] == 0){
                    array2D[i][j] = (i+j) * 100 + 100;
                }
            }
        }

        for (int[] ints : array2D) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
