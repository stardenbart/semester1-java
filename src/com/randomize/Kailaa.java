package com.randomize;

import java.util.Scanner;

public class Kailaa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama user: ");
        String nama = input.next();

        if(nama.equals("Kaila") ^ nama.equals("kaila") ^ nama.equals("Kailaa")) {
            System.out.println();
            System.out.println("Selamat malam kailaa, semoga mimpi indah.");

        }else{
            System.out.println();
            System.out.println("Maaf nama anda bukan kailaa.");
            System.out.println("Harap segera meninggalkan program " + nama);

        }
        input.close();
    }
}
