package com.program;
import java.util.*;
public class ProgramBilanganGenapGanjil {

    public static void main(String[] args) {
        System.out.println("Program Menentukan Bilangan Genap & Ganjil");
        Scanner input = new Scanner(System.in);

        int i, j, k, n;
        int data;
        System.out.print("Mulai Porgram? " +
                "Input 1(YES) 0(NO): ");
        data = input.nextInt();

        while(data == 1){
            System.out.print("Input data awal: ");
            n = input.nextInt();
            System.out.print("Sampai: ");
            k = input.nextInt();

            if(n > k){
                System.out.println("Data akhir harus lebih besar, Ulang kembali: ");
                System.out.print("Input data awal: ");
                n = input.nextInt();
                System.out.print("Sampai: ");
                k = input.nextInt();
            }else if(n == 0 || k == 0){
                System.out.println("Data tidak boleh 0, Ulang kembali: ");
                System.out.print("Input data awal: ");
                n = input.nextInt();
                System.out.print("Sampai: ");
                k = input.nextInt();
            }

            System.out.println("--------------------------------------------");

            System.out.println("===Genap===");
            for(i = n; i <= k; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.printf("\n===Ganjil===\n");

            for(j = n; j <= k; j++){
                if (j % 2 != 0) {
                    System.out.print(j + " ");
                }
            }

            System.out.printf("\nMulai ulang program?" +
                    "Input 1(YES) 0(NO): ");
            data = input.nextInt();
        }
    }
}
