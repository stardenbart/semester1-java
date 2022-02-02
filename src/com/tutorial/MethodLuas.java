import java.util.*;
public class MethodLuas {
    public static void main(String[] args) {
        System.out.println("Program Menggambar Persegi Beserta Luas dan Keliling.");
        Scanner input = new Scanner(System.in);

        System.out.print("Panjang: ");
        int inputpanjang = input.nextInt();
        System.out.print("Lebar: ");
        int inputlebar = input.nextInt();

        gambar(inputpanjang, inputlebar);

        luasKeliling(inputpanjang, inputlebar);

        input.close();

    }
    public static void gambar(int panjang, int lebar){
        for(int i = 0 ; i < lebar; i++){
            for(int j = 0; j < panjang; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void luasKeliling(int panjang, int lebar){
        int hasil = panjang * lebar;
        int hasil1 = (panjang + lebar) * 2;
        System.out.println("Menghitung luas dengan panjang " + panjang + ", lebar " + lebar);
        System.out.println("Hasilnya adalah: " + hasil);

        System.out.println();

        System.out.println("Menghitung keliling dengan panjang " + panjang + ", lebar " + lebar);
        System.out.println("Hasilnya adalah: " + hasil1);
    }
}
