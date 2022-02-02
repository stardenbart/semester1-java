package com.randomize;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class MemoryRandom {
    public static void main(String[] args) {
        System.out.println("Program Random di Memory Coffee.\n");
        boolean akses = false;

        try{
            System.out.print("Jokowi Kayang jika: ");
            Scanner input = new Scanner(System.in);
            String nama = input.next();
            input.close();
            while (!akses) {
                if (!Objects.equals(nama, "YNTKTS")) {
                    throw new InputMismatchException("===Input yang anda masukkan salah===");
                } else {
                    akses = true;
                    System.out.println("===Kode yang anda masukkan benar===");
                }
            }
        }catch (InputMismatchException ex){
            System.out.println("===Input yang anda masukkan salah===");
        }finally {
            System.out.println("\nAkhir Program.");
        }
    }
}
