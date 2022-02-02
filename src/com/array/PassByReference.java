package com.array;
import java.util.*;
public class PassByReference {
    public static void main(String[] args) {

        int[] arrayAngka1 = {1, 2, 3, 4, 5};
        int[] arrayAngka2 = new int[5];

        arrayAngka2 = arrayAngka1;
        System.out.println("Ini adalah array 1: " + Arrays.toString(arrayAngka1));
        System.out.println("Ini adalah array 1: " + Arrays.toString(arrayAngka2));

        arrayAngka1[0] = 100;
        arrayAngka2[1] = 400;
        System.out.println("Ini adalah array 1: " + Arrays.toString(arrayAngka1));
        System.out.println("Ini adalah array 1: " + Arrays.toString(arrayAngka2));

        ubahArray(arrayAngka1);
        ubahArray(arrayAngka2);

    }

    private static void ubahArray (int[] a){
        a[0] = 125;
        for(int b : a){
            System.out.print(b);
        }
        System.out.println();
        System.out.println(Arrays.toString(a));
    }
}
