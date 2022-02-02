package com.array;

public class MatriksExample {
    public static void main(String[] args) {
        int matriksA[][] = new int[5][5];
        //[2] sebagai baris (pertama)
        //[6] sebagai kolom (kedua)

        System.out.println("=====Matriks A=====");
        for(int i = 0; i < matriksA.length; i++) {
            for (int j = 0; j < matriksA[i].length; j++) {
                System.out.print("  " + matriksA[i][j] + " ");
            }
            System.out.println();
        }


        int a[][] = { {1, 3, 5}, {2, 4, 8}};
        System.out.println("=====Matriks B=====");

        for(int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("   " + a[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("=====String Array=====");
        String nama[] = {"Budi", "Ahmad", "Joko"};
        for(int i = 0; i < nama.length; i++){
            System.out.println("Nama saya adalah: " + nama[i]);
        }


    }
}
