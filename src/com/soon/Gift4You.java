package com.soon;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Gift4You {
    public static void main(String[] args) {
        Scanner you = new Scanner(System.in);
        System.out.println("Program Hanya Untukmu.");
        System.out.println("====================================");

        System.out.print("Masukkan nama lengkap anda (Tanpa Spasi yaa!): ");
        String nama = you.next();
        if(nama.equals("erdaliachantika") || nama.equals("ErdaliaChantika")) {
            System.out.println();
            System.out.println("Selamat Datang " + nama);
            System.out.println("Senang dapat melihat program ini kesampean untuk bisa anda jalankan!");

            System.out.println();
            System.out.println("Sepertinya author saya masih memiliki keberanian.");
            System.out.println("walau sedikit:))");
            System.out.println();

            try {
                int data;
                System.out.print("Mulai Program? " +
                        "Input 1(YES) 0(NO): ");
                data = you.nextInt();

                while (data == 1) {
                    System.out.println();
                    System.out.println("Berikut sedikit hal yang ingin author berikan kepada anda dari dulu");
                    System.out.print("Pilih salah satu, (pesan, lagu, puisi, penyesalan): ");
                    String pilihan = you.next();
                    if (pilihan.equals("lagu")) {
                        System.out.println();
                        System.out.println("Title: One Day");
                        System.out.println("By: Stardenbart.");

                        System.out.print("\n Today is another boring day" +
                                "\n Im gonna sleep and let the day go through~" +
                                "\n and then, i wish that i could forget about you" +
                                "\n but thats no easy" +
                                "\n eventhough i've tried what can i do");

                        System.out.println();

                        System.out.print("\n One day" +
                                "\n if you have all the right," +
                                "\n the money, and the brave" +
                                "\n hold her hand and never let it go!" +
                                "\n and once again" +
                                "\n make her be your" +
                                "\n forever after");
                        System.out.println("\n");
                        System.out.println("p.s: i can sing it for you, but no chance hehee.");

                    } else if (pilihan.equals("pesan")) {
                        System.out.println();
                        System.out.println("Gatau sie apalagi yang mau diomongin." +
                                "\nMungkin semua pesan udah diwakilin di pilihan 'PENYESALAN'" +
                                "\ndan aku sadar kok bukan karena aku ga cukup baik buat kamu" +
                                "\nits not like im making down on you" +
                                "\nbut, im just being positive for myself" +
                                "\nkarena aing gamau lagi jadi orang yang paling seneng nyalahin diri sendiri" +
                                "\nsalah satu sifat yang sampai sekarang masih aing pelihara" +
                                "\ni hope u understand it, but for the last but not least" +
                                "\ni cant stop loving you, no i won't" +
                                "\n" +
                                "\ncause u know me very well chann" +
                                "\nand its just hard to make another women know the old me and still keep stayin with me" +
                                "\n" +
                                "\nwell, thats it" +
                                "\nthank you!");

                    } else if (pilihan.equals("puisi")) {
                        System.out.println();
                        System.out.println("HEIII!, do you remember this:))" +
                                "\n" +
                                "\nFilosofiku" +
                                "\nOleh: Abdullah Farauk" +
                                "\n");

                    } else if (pilihan.equals("penyesalan")) {
                        System.out.println();
                        System.out.println("Alhamdulillah gaada penyesalan kok." +
                                "\nTerkadang emang mikir, banyak hal yang ingin diubah jika waktu bisa diulang" +
                                "\ntapi pada akhirnya semua yang terjadi bakalan jadi bagian dari hidup kita" +
                                "\nkalo aing ga ketemu kamu, mungkin faruq yang sekarang gabakal jadi seperti ini" +
                                "\ndan pada akhirnya, semua yang terjadi antara kita adalah takdir" +
                                "\ntakdir yang terkadang kuharap gapernah berakhir" +
                                "\ntapi memang takdir berkata lain" +
                                "\nsemua yang datang pasti akan pergi dan berakhir." +
                                "\n" +
                                "\nTengkyuu for the time that you've made for me" +
                                "\ni dont even know the reason why im falling so hard for you" +
                                "\nbut at least i know that i dont regret that i've ever falling for you.");

                    } else {
                        System.out.println();
                        System.out.println("Maaf channn, giftnya ketik salah satu dari pilihan yaa!");
                        System.out.println();
                        System.out.print("Mau coba ngulang?" +
                                "\nInput 1(YES) 0(NO): ");
                        data = you.nextInt();

                    }

                    System.out.println();
                    System.out.print("Mau coba liat gift lainnya?" +
                            "\nInput 1(YES) 0(NO): ");
                    data = you.nextInt();
                }
                if (data == 0) {
                    System.out.println();
                    System.out.println("Keknya semua uda di buka yaa.");
                    System.out.println("Kalo belum buka ulang aja yaa programnya.");
                    System.out.println("IDK, if it is good enough but at least it is what it is:)");
                    System.out.println("Makasih channnn!");
                } else if (data != 0 || data != 1) {
                    System.out.println();
                    System.out.println("Eh kamu salah input nih, pilih 1 untuk YES dan 0 untuk NO" +
                            "\nMakasih udah di bukak!" +
                            "\nDiinput ulang yokk chann:");
                    data = you.nextInt();
                } else{
                System.out.println();
                System.out.println("Maaf anda tidak dapat menjalankan program ini.");
                System.out.println("Silahkan cari orang lain:)) " + nama);
                }
            }catch (InputMismatchException ex){
                System.out.println("Keknya kamu salah input deh, cek lagi yaa!");
            }
        }
        batas(); batas();


        System.out.println("\nAkhir Program");

        you.close();
    }

    private  static  void batas(){
        System.out.println("========================================================================================");

    }
}
