public class PerpangkatanDraft {
    public static void main(String[] args) {
        System.out.println("Program Perpangkatan dan Faktorial.");

        batas();

        int hasil = perpangkatanNilai(2,10);
        System.out.println(hasil);

        batas();

        int fakt = faktorial(5);
        System.out.println(fakt);

        batas();

        int fakt1 = faktorial(3);
        System.out.println(fakt1);

        batas();

        int temp = permutasi(5,2);
        System.out.println(temp);

        batas();

    }

    public static int perpangkatanNilai(int a, int b){
        System.out.print("Hasil dari " + a + " pangkat " + b + ": ");
        int x = 1;
        for(int i = 0; i < b; i++){
            x *= a;
        }
        return x;
    }

    private static int faktorial(int a){
        System.out.print("Faktorial dari " + a + ": ");
        int x = 1;
        for(int i = 1; i <= a; i++){
            x *= i;
        }
        return x;
    }

    private static int permutasi(int a, int r){
        System.out.println("Berikut hasil permutasi dengan n: " + a + " dan r: " + r + ":");
        return faktorial(a) / faktorial(a - r);
    }

    private static void batas(){
        System.out.println("=================================================================");
    }
}
