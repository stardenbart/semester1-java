import java.util.Scanner;

public class OverloadMethod {
    public static void main(String[] args) {
        System.out.println("Program Fungsi Overload.");
        System.out.println("==============================================");

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        int awal = input.nextInt();
        System.out.print("Masukkan nilai b: ");
        int akhir = input.nextInt();

        int hasil = tambah(awal, akhir);
        printAngka(hasil);
        int hasilKurang = kurang(awal, akhir);
        printAngka(hasilKurang);
        System.out.println("==============================================");

        System.out.print("Masukkan float1: ");
        float awal1 = input.nextFloat();
        System.out.print("Masukkan float2: ");
        float akhir1 = input.nextFloat();

        float hasilTambah = tambah(awal1, (int)akhir1);
        printAngka(hasilTambah);
        float hasilKurang1 = kurang(awal1, (int)akhir1);
        printAngka(hasilKurang1);
        System.out.println("==============================================");

        printAngka(12);
        printAngka(12.4d);
        printAngka(10.2f);

        System.out.println("==============================================");
        System.out.println("Akhir Program.");
        input.close();
    }
    private static float tambah(float a, int b){
        return a + b;
    }

    private static float kurang(float a, int b){
        return a - b;
    }

    private static int tambah(int a, int b){
        return a + b;
    }

    private static int kurang(int a, int b){
        return a - b;
    }

    private static void printAngka(int nilaiInt){
        System.out.println("Ini adalah angka integer: " + nilaiInt);
    }

    private static void printAngka(double nilaiDouble){
        System.out.println("Ini adalah angka doubel: " + nilaiDouble);
    }

    private static void printAngka(float nilaiFloat){
        System.out.println("Ini adalah angka float: " + nilaiFloat);
    }
}
