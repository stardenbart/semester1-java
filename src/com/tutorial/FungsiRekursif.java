import java.util.*;
public class FungsiRekursif {
    public static void main(String[] args) {
        System.out.println("Tutorial Fungsi Rekursif.");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        System.out.println("Anda memasukkan nilai: " + nilai);
        System.out.println("=========================================");
        printNilai(nilai);

        int jumlah = penjumlahanNilai(nilai);
        System.out.println("Jumlah nilai adalah: " + jumlah);

        int perkalian = faktorial(nilai);
        System.out.println("Faktorial dari nilai adalah: " + perkalian);

        input.close();
    }

    private static int faktorial(int a){
        System.out.println("Parameter: " + a);
        if(a == 1){
            return a;
        }

        return a * faktorial(a - 1);
    }

    private static int penjumlahanNilai(int a){
        System.out.println("Parameter: " + a);

        if(a == 0){
            return a;
        }

        return a + penjumlahanNilai(a - 1);


    }

    private static void printNilai(int a){
        System.out.println("Nilai: " + a);

        if(a == 0){
            return;
        }
        a--;

        printNilai(a);
    }
}
