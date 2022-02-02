package com.randomize;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KDHRandom {
    public static void main(String[] args) {
        System.out.println("Program Kegabutan Aing Yang Pertama.");

        pembagianBilangan();

    }

    private static void batas() {
        System.out.println("=====================================================================================");
    }

    private static void pembagianBilangan() {
        Scanner input = new Scanner(System.in);
        boolean inputOke = false;
        while (!inputOke) {

            try {
                System.out.print("Masukkan Pembilang: ");
                double a = input.nextInt();

                System.out.print("Masukkan Penyebut: ");
                double b = input.nextInt();
                if (b == 0) {
                    throw new ArithmeticException("Pembagi tidak boleh nol.");
                }else {
                    inputOke = true;
                }
                System.out.println(a + " / " + b + " is " + a / b);
            } catch (InputMismatchException e){
                System.out.println("Input yang anda masukkan salah.");
            } catch (ArithmeticException ex) {
                System.out.println("Pembagi tidak boleh nol.");
            } finally {
                System.out.println("\nAkhir Program");
            }
        }
    }
}
