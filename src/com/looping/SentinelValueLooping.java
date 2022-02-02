package com.looping;
import java.util.Scanner;
public class SentinelValueLooping {
    public static void main(String[] args) {
        System.out.println("Contoh Program Looping Sentinel Value");
        Scanner put = new Scanner(System.in);

        int data;
        System.out.print("Masukkan bilangan (Terhenti jika bilangan diinput 0): ");
        data = put.nextInt();

        int sum = data;

        while(data != 0) {
            System.out.print("Masukkan bilangan (Terhenti jika bilangan diinput 0): ");
            data = put.nextInt();

            sum += data;
        }
        System.out.println(sum);

        put.close();
    }
}
