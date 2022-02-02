package com.praktikum;

import java.util.Scanner;

public class Praktikum14 {
    public static void main(String[] args) {
        System.out.println("Program Try & Catch ArithmeticException.\n");
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        System.out.print("Masukkan pembilang: ");
        number1 = input.nextInt();
        System.out.print("Masukkan penyebut: ");
        number2 = input.nextInt();
        double hasil = (double)number1/number2;
        input.close();
        
        try{
            if(number2 == 0){
                throw new ArithmeticException("Divisor cannot be zero");
            }
            System.out.println(number1 + " / " + number2 + " is " + hasil);
        }catch (Exception ex){
            System.out.println("Divisor cannot be zero");
        }

        System.out.println("\nAkhir Program");
    }
}
