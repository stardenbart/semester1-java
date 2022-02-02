package com.string;
import java.util.*;
public class StringIntroduction {
    public static void main(String[] args) {

        //=================String pada java itu=================
        //1. String di java itu immutable.
        //2. String yang berada di String Pool itu reusable
        //   sehingga menjadi lebih efisien.
        //3. Membuat String dengan method baru, maka ia akan diletakkan
        //   pada memori lain, bukan di String Pool.

        System.out.println("Program Awal Pengenalan String.");
        batas();
        String kataString = "Hello World.";
        char[] kataChar = {'H','e','l','l','o'};

        System.out.println(kataString);
        System.out.println(Arrays.toString(kataChar));

        batas();
        System.out.println("Mengambil salah satu index pada String.");
        System.out.println(kataChar[0]);
        System.out.println(kataString.charAt(0));

        batas();
        System.out.println("Merubah salah satu komponen index pada String.");
        kataChar[0] = 'C';
        System.out.println(Arrays.toString(kataChar));
        kataString = "C" + kataString.substring(1,5);
        System.out.println(kataString);

        batas();

        addressData(kataString, "Data String");
    }

    private  static  void  batas(){
        System.out.println("=======================================================================================");
    }

    private static void addressData(String data, String nama){
        int address = System.identityHashCode(data);
        System.out.println(nama + ": " + data + "\tAddress || " + Integer.toHexString(address));
    }
}
