package com.randomize;
import java.util.Scanner;
public class RandomAja {
    public static void main(String[] args){
        System.out.println("Program Paruq Gabut.");
        batas();

        StringBuilder built = new StringBuilder();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan input nama anda: ");
        String nama = input.next();
        System.out.printf("Halo %s, senang bisa melihat anda.\n", nama);
        batas();

        System.out.print("Masukkan umur anda: ");
        int umur = input.nextInt();
        System.out.printf("%s, anda berumur %d tahun, semoga anda tetap panjang umur.\n", nama, umur);
        batas();

        System.out.print("Apakah ada program yang ingin anda jalankan?" +
                "\nYES(1) NO(0): ");
        int data = input.nextInt();
        batas(); batas();

        while(data == 1){
            System.out.println("Anda telah memasuki inti program.");
            System.out.printf("Halo %s, mari kita mulai!\n",nama);
            batas();
            System.out.print("Program apa yang ingin anda jalankan?" +
                    "\n(penjumlahan, pengurangan, perkalian, pembagian): ");
            String put = input.next();
            batas(); batas();

            if(put.equals("penjumlahan")){

                System.out.print("Masukkan bilangan pertama: ");
                int a = input.nextInt();
                System.out.print("Masukkan bilangan kedua: ");
                int b = input.nextInt();
                batas();

                int hasil = penjumlahan(a,b);

                System.out.printf("Hasil pertambahan dari %d dengan %d adalah: %d\n",a, b, hasil);
                System.out.print("Mulai lagi program?" +
                        "\nYES(1) NO(0): ");
                data = input.nextInt();
                batas(); batas();

            }else if(put.equals("pengurangan")){
                System.out.print("Masukkan bilangan pertama: ");
                int a = input.nextInt();
                System.out.print("Masukkan bilangan kedua: ");
                int b = input.nextInt();

                int hasil = pengurangan(a,b);

                System.out.printf("Hasil pertambahan dari %d dengan %d adalah: %d\n",a, b, hasil);
                System.out.print("Mulai lagi program?" +
                        "\nYES(1) NO(0): ");
                data = input.nextInt();
                batas(); batas();

            }else if(put.equals("perkalian")){
                System.out.print("Masukkan bilangan pertama: ");
                int a = input.nextInt();
                System.out.print("Masukkan bilangan kedua: ");
                int b = input.nextInt();

                int hasil = perkalian(a,b);

                System.out.printf("Hasil pertambahan dari %d dengan %d adalah: %d\n",a, b, hasil);
                System.out.print("Mulai lagi program?" +
                        "\nYES(1) NO(0): ");
                data = input.nextInt();
                batas(); batas();

            }else if(put.equals("pembagian")){
                System.out.print("Masukkan bilangan pertama: ");
                int a = input.nextInt();
                System.out.print("Masukkan bilangan kedua: ");
                int b = input.nextInt();

                int hasil = pembagian(a,b);

                System.out.printf("Hasil pertambahan dari %d dengan %d adalah: %d\n",a, b, hasil);
                System.out.print("Mulai lagi program?" +
                        "\nYES(1) NO(0): ");
                data = input.nextInt();
                batas(); batas();

            }else{
                batas(); batas();

                System.out.print("Input yang anda masukkan salah!" +
                        "\n(penjumlahan, pengurangan, perkalian, pembagian): ");
                put = input.next();

            }


        }
        System.out.println("AKHIR PROGRAM." +
                "\nTerima Kasih telah mengakses program ini!");

    }

    private  static  void batas(){
        System.out.println("================================================================================");
    }

    private static int penjumlahan(int a, int b){
        int hasil = a + b;
        return hasil;
    }

    private static int pengurangan(int a, int b){
        int hasil = a - b;
        return hasil;
    }

    private static  int perkalian(int a, int b){
        int hasil = a * b;
        return hasil;
    }

    private  static  int pembagian(int a, int b){
        int hasil = a / b;
        return hasil;
    }
}
