package com.string;

import java.io.FileInputStream;
import java.io.IOException;

public class IOStream {
    public static void main(String[] args) throws IOException {
        System.out.println("Program Pengenalan IO Stream.");
        batas();

//        try{
//            FileInputStream newFile = new FileInputStream("input");
//        }catch(IOException e){
//            System.out.println(e);
//        }

        FileInputStream newFile = new FileInputStream("Null");
        System.out.println((char)newFile.read());
        System.out.println((char)newFile.read());
        System.out.println((char)newFile.read());
        System.out.println((char)newFile.read());
        System.out.println((char)newFile.read());
        System.out.println((char)newFile.read());
        System.out.println((char)newFile.read());
        System.out.println((char)newFile.read());
        System.out.println((char)newFile.read());
        System.out.println((char)newFile.read());

        newFile.close();


    }

    private static void batas(){
        System.out.println("======================================================================================");
    }
}
