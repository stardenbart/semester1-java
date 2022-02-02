package com.string;
import java.io.*;
import java.util.Scanner;

public class StringException {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Program Exception: Try, Catch, dan Finally.");
        batas();
        int[] array = {0,1,2,3};
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan index nilai array: ");
        int index = input.nextInt();


        //Exception handling, try, catch, and finally
        System.out.println("Handling Out of Bound: ");
        try{
            System.out.printf("Nilai array index ke-%d, adalah %d\n",index,array[index]);
        } catch (Exception e){
            System.err.println(e);
        }

        //Runtime Error jika file tidak ada
        System.out.println("Handling IO Not Found: ");
        try{
            FileInputStream fileInput = new FileInputStream("Input.txt");
        } catch (IOException e){
            System.err.println(e);
        }

        //Menggabungkan 2 Exception
        System.out.println("Combining 2 Exception: ");
        try{
            System.out.printf("Nilai array index ke-%d, adalah %d\n",index,array[index]);
            FileInputStream fileInput = new FileInputStream("Input.txt");
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Index yang anda masukkan tidak sesuai dengan index array.");
        } catch (IOException e){
            System.err.println("File tidak ditemukan");
        }

        //Finally
        System.out.println("Combining 2 Exception: ");
        try{
            System.out.printf("Nilai array index ke-%d, adalah %d\n",index,array[index]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Index yang anda masukkan tidak sesuai dengan index array.");
        }finally {
            System.out.println("Finally, kedua hal diatas terjadi error karena index yang dimasukkan tidak sesuai" +
                    "dan file input tidak dapat ditemukan oleh sistem.");
        }


        System.out.println("Akhir Program.");
    }

    private static void batas(){
        System.out.println("==========================================================================================");
    }
}
