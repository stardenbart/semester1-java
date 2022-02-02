package com.array;
import java.util.Arrays;
public class NextLevelArrayEx {
    public static void main(String[] args) {
        System.out.println("Operasi Yang Ada Pada Array");

        int[] arrayAngka = {12, 13, 14, 15, 16};
        printArray(arrayAngka);

        batas();

        int[] arrayAngka2 = new int[5];
        printArray(arrayAngka);
        printArray(arrayAngka2);

        batas();

        copyArray(arrayAngka2, arrayAngka);

        batas();

        System.out.println("Mengkopi dengan 'copyOf': ");
        int[] arrayAngka3 = Arrays.copyOf(arrayAngka, 5);
        printArray(arrayAngka3);

        System.out.println("\nMengkopi dengan 'copyOfRange: ");
        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka, 2, 5);
        printArray(arrayAngka4);

        batas();

        System.out.println("Mengisi array atau fillArray: ");
        int[] arrayAngka5 = new int[10];
        Arrays.fill(arrayAngka5, 1);
        printArray(arrayAngka5);

        batas();

        System.out.println("Mengkomparasi elemen array: ");
        int[] arrayAngka6 = {1, 2, 4, 4, 5};
        int[] arrayAngka7 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.equals(arrayAngka6, arrayAngka7));

        if(Arrays.equals(arrayAngka6, arrayAngka7)){
            System.out.println("Array ini sama.");
        }else{
            System.out.println("Array ini beda.");
        }

        System.out.println("\nMengecek array yang lebih besar: ");
        System.out.println(Arrays.compare(arrayAngka6, arrayAngka7));

        System.out.println("\nMengecek array mana yang indexnya berbeda: ");
        System.out.println(Arrays.mismatch(arrayAngka6, arrayAngka7));

        batas();

        System.out.println("Sorting nilai array: ");
        int[] arrayAngka8 = {1,3,4,5,3,63,8,34,45,67};
        printArray(arrayAngka8);
        Arrays.sort(arrayAngka8);
        printArray(arrayAngka8);

        System.out.println("\nMencari index bilangan tertentu dari array: ");
        int angka = 3;
        int index = Arrays.binarySearch(arrayAngka8, angka);
        System.out.println(angka + " ada di index ke-" + index);

        batas();
        batas();

        System.out.println("\nTUGAS ARITMATIKA ARRAY: ");
        int[] a = {1,2,3,5,6,7,10};
        int[] b = {2,3,4,5,9,10,6};
        int[] c = new int[7];
        printArray(a); printArray(b);
        aritmatikaArray(a, b, c);

        batas();
        batas();

        System.out.println("\nTUGAS MENGGABUNGKAN 2 ARRAY: ");
        int[] x = {1,2,3,4,5};
        int[] y = {6,7,8,9,10};
        printArray(x); printArray(y);
        System.out.println("Hasil gabungan array tersebut adalah: ");
        gabungArray(x, y);

        batas();
        batas();

        System.out.println("\nTUGAS MENSORTIR DARI TERBESAR KE TERKECIL ARRAY: ");
        int[] ab = {57,89,21,65,3,78};
        Arrays.sort(ab);
        printArray(ab);
        System.out.println("Hasil reverse: ");
        reverseArray(ab);


    }

    private static void batas(){
        System.out.println("======================================================================================");
    }

    private static void printArray(int[] a){
        System.out.println("Array = " + Arrays.toString(a));
    }

    private static void copyArray(int[] a, int[] b){
        for(int i = 0; i < b.length; i++){
            a[i] = b[i];
        }
        System.out.println("Array = " + Arrays.toString(a));
    }

    private static void aritmatikaArray(int[] a, int[] b, int[] hasil){
        for(int i = 0; i < a.length; i++){
            hasil[i] = a[i] + b[i];

        }
        printArray(hasil);
    }

    private static void gabungArray(int[] a, int[] b){
        int[] hasil = new int[a.length + b.length];
        for(int i = 0; i < a.length; i++){
            hasil[i] = a[i];
        }

        for(int i = 0; i < b.length; i++){
            hasil[i + a.length] = b[i];
        }

        printArray(hasil);
    }

    private static void reverseArray(int[] a) {
        int[] arrayBuffer = Arrays.copyOf(a, a.length);
        for(int i = 0; i < a.length; i++){
            a[i] = (arrayBuffer[(arrayBuffer.length - 1) - i]);
        }
        printArray(a);
    }

}
