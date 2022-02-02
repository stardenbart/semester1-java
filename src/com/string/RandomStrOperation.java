package com.string;
import java.util.*;
public class RandomStrOperation {
    public static void main(String[] args) {

        Integer x;
        Float y;

        x = 50;
        y = 50f;

        System.out.println("Object equation, x.equals(y): ");
        System.out.println(x + " dan " + y + " hasilnya: " + x.equals(y));
        System.out.println(y + " dan " + x + " hasilnya: " + y.equals(50));

        Integer i = 50;
        ArrayList list = new ArrayList();
        list.add(50);
        list.add("Hello World");

        System.out.println("\nInteger toString: "
                + "\n" + i.toString()); //toString dipanggil manual
        System.out.println(i); //toString dipanggil otomatis
        System.out.println("\nArrayList toString: "
                + "\n" + list.toString());
        System.out.println(list);

        ArrayList<String> nama = new ArrayList<>();
        nama.add("Joko");
        nama.add("Prabowo");
        nama.add("Megawati");
        nama.add("Kahlil");

        System.out.println(nama);
    }
}
