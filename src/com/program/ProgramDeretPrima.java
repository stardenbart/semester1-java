package com.program;
import java.util.Scanner;
public class ProgramDeretPrima {

    public static void main(String[] args) {
        System.out.println("Programn Deret Prima");
        Scanner input = new Scanner(System.in);

        int i, j, k, n, data;
        System.out.print("Mulai Program? " +
                "Input 1(YES) 0(NO): ");
        data = input.nextInt();
        while(data == 1){
            System.out.print("Masukkan Bilangan Awal: ");
            n = input.nextInt();
            System.out.print("Masukkan Bilangan Akhir: ");
            k = input.nextInt();

            while (n == 0 || k == 0) {
                System.out.println("Input bilangan salah, harap dicoba lagi");
                System.out.print("Masukkan Bilangan Awal: ");
                n = input.nextInt();
                System.out.print("Masukkan Bilangan Akhir: ");
                k = input.nextInt();
            }

            while(n > k){
                System.out.println("Bilangan akhir harus lebih besar, harap coba lagi");
                System.out.print("Masukkan Bilangan Awal: ");
                n = input.nextInt();
                System.out.print("Masukkan Bilangan Akhir: ");
                k = input.nextInt();
            }

            System.out.println("------------------------------------------------------------------");

            for (i = n; i <= k; i++) {
                int sum = 0;
                for (j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        sum += 1;
                    }
                }
                if (sum == 2) {
                    System.out.print(i + " ");
                }
            }
            System.out.printf("\nMulai ulang Program? " +
                    "Input 1(YES) 0(NO): ");
            data = input.nextInt();
        }
    }
}
