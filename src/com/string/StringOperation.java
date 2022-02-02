package com.string;
import java.lang.String;
import java.util.Scanner;
public class StringOperation {
    public static void main(String[] args) {
        System.out.println("Program Operasi Pada String.");
        batas();
        String kalimat = "Aku cinta padamu.";
        //Mengambil komponen dari String:
        System.out.println(kalimat.charAt(4));

        //Substring:
        String kata = kalimat.substring(4,9);
        System.out.println("\n" + kata);

        //Concatenation (concate):
        System.out.println("\n" + kata + " mati.");
        kata = kata + " hidup.";
        System.out.println(kata);

        //Concate non String:
        int nilai = 100;
        String kalimat2 = kata + " " + nilai + "%. "; //Casting
        System.out.println(kalimat2);
        System.out.println(kata + " " + nilai + "%. ");

        //Uppercase & Lowercase:
        System.out.println("\n" + kalimat.toLowerCase());
        System.out.println(kalimat.toUpperCase());

        //Replace String:
        String kalimat3 = kalimat.replace("padamu.", "padanya.");
        System.out.println("\n" + kalimat);
        System.out.println(kalimat3);

        //Compare String:
        String mobil = "Avanza";
        String mobil2 = "Xenia";
        System.out.println("\nKomparasi dari " + mobil + " dan " + mobil2);
        System.out.println(mobil.compareTo(mobil2));
        System.out.println(mobil2.compareTo(mobil));

        String pempek = "Bakwan";
        String gorengan = "Bala";
        System.out.println("\nKomparasi dari " + pempek + " dan " + gorengan);
        System.out.println(pempek.compareTo(gorengan));
        System.out.println(gorengan.compareTo(pempek));

        //Equality == Persamaan:
        //String kataInput = "test."; //SAMA, karena berada di String Pool
        String kataInput = new String("test."); //BEDA, karena bukan merupakan String Literal dan tidak terletak di String Pool.
        String kataUser = "test.";

        System.out.println("\nPersamaan Kata String: ");
        if(kataInput == kataUser){
            System.out.println("SAMA");
        }else{
            System.out.println("BEDA");
        }

        Scanner input = new Scanner(System.in);
        System.out.print("\nMengambil input dari user: ");
        String inputUser = input.next(); //Tidak di String Pool
        System.out.println("Input user adalah: " + inputUser);
        System.out.println("\nPersamaan Kata String: ");
        if(kataUser.equals(inputUser)){
            System.out.println("SAMA");
        }else{
            System.out.println("BEDA");
        }

        input.close();

    }

    private static void batas(){
        System.out.println("======================================================================================");
    }
}
