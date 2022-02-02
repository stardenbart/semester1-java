package com.program;
import java.util.Scanner;

public class ProgramKonversiNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Menentukan Nilai");

        System.out.print("Mulai program? " +
                "1(YES) 0(NO): ");
        int data = input.nextInt();

        int i = data;

        while(data != 0) {
            System.out.print("Input Nilai: ");
            float n = input.nextInt();

            if (n <= 100 && n >= 90) {
                System.out.println("A");
            } else if (n <= 89 && n >= 75) {
                System.out.println("B");
            } else if (n <= 74 && n >= 60) {
                System.out.println("C");
            } else if (n <= 59 && n >= 40) {
                System.out.println("D");
            } else if (n <= 30 && n >= 0) {
                System.out.println("E");
            } else {
                System.out.println("Nilai yang dimasukkan salah.");
            }

            System.out.print("Mulai ulang program? " +
                    "1(YES) 0(NO): ");
            data = input.nextInt();
            input.close();
        }
    }
}
