package com.string;
import java.util.Scanner;
public class StringMethodException {
    public static void main(String[] args) {
        System.out.println("Program Exception Bentuk Method.");
        batas();
        int[] arrayData = {0,1,2,3};
        Scanner input = new Scanner(System.in);
        System.out.print("Data ke-");
        int data = input.nextInt();
        System.out.println();

        System.out.println("INI ADALAH EXCEPTION BIASA: ");
        exceptionUmum(data, arrayData);
        System.out.println();

        input.close();

        batas();

        System.out.println("INI ADALAH EXCEPTION METHOD: ");
        int testArray = testDataArray(data, arrayData);
        System.out.printf("Data dari index %d, adalah array nilai %d\n\n",data,testArray);

        batas();

        System.out.println("EXCEPTION THROWS BY METHOD: ");
        int testArray2 = 0;
        try {
            testArray2 = ambilData(data, arrayData);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.printf("Data dari index %d, adalah array nilai %d\n\n",data,testArray2);

        batas(); batas();

        System.out.println("\nAkhir Program.");
    }

    private static int ambilData(int a, int[] array) throws Exception{
        return array[a];
    }

    private static int testDataArray(int index, int[] array){
        int hasil = 0;
        try{
            hasil = array[index];
        }catch (Exception e){
            System.out.println("\n" + e);
        }
        return hasil;
    }

    private static void exceptionUmum(int data, int[] array){
        try{
            System.out.printf("Data dari index %d, adalah array nilai %d\n",data,array[data]);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    private static void batas(){
        System.out.println("=======================================================================================");
    }
}
