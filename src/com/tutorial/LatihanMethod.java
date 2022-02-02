import java.util.*;
public class LatihanMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Menentukan Hari dan Suhu.");
        System.out.println("=====================================================");
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        double[] suhu = {29.3, 30.1, 32, 35.9, 36.7, 33, 29};

        System.out.print("Masukkan indeks hari: ");
        int indeks = input.nextInt();
        System.out.println("=====================================================");
        cekHari(suhu, indeks, hari);
        System.out.println("=====================================================");

        for (int i = 0; i <= hari.length; i++) {
            System.out.println(hari[i] + ": " + suhu[i] + " Derajat celcius.");
            if(i == hari.length){
                break;
            }
        }

        System.out.println("Akhir Program.");
        input.close();
    }

    private static void cekHari(double[] suhu, int indeks, String[] hari) {
        double min = suhu[0];
        double max = suhu[0];
        for (int i = 0; i < suhu.length; i++) {
            if (max < suhu[i]) {
                max = suhu[i];
            } else if (min > suhu[i]) {
                min = suhu[i];
            }
        }
        System.out.println("Suhu tertinggi adalah: " + max + " derajat celcius.");
        System.out.println("Suhu terendah adalah: " + min + " derajat celcius");

        System.out.println("Suhu pada hari " + hari[indeks] + " adalah " + suhu[indeks] + " derajat celcius");
    }
}
