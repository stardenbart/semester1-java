package com.string;
import java.lang.StringBuilder;
public class StringBuilderOp {
    public static void main(String[] args) {
        System.out.println("Program String Builder.");
        batas();
        StringBuilder built = new StringBuilder("Hello");
        printData(built);

        //Append
        batas();
        built.append(" World");
        printData(built);
        batas();
        built.append(" Good Morning!!");
        printData(built);

        //Insert
        batas();
        built.insert(16, " Fuckin");
        printData(built);

        //Delete
        batas();
        built.delete(16,23);
        printData(built);

        //Mengganti Index
        batas();
        built.setCharAt(15, 'D');
        printData(built);

        //Replace
        batas();
        built.replace(17, 24, "Night");
        printData(built);

        //Casting menjadi String
        batas();
        String kalimat = built.toString();
        System.out.println(kalimat);
        int addressString = System.identityHashCode(kalimat);
        System.out.println("Address = " + Integer.toHexString(addressString));


    }
    private static void printData(StringBuilder built){
        System.out.println("Data = " + built);
        System.out.println("Panjang = " + built.length());
        System.out.println("Kapasitas = " + built.capacity());
        int address = System.identityHashCode(built);
        System.out.println("Address = " + Integer.toHexString(address));
    }

    private static void batas(){
        System.out.println("=============================================");
    }
}
