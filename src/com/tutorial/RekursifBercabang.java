import java.util.*;
public class RekursifBercabang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Tutorial Rekursif Bercabang.");
        System.out.println("=======================================================");
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        System.out.println("=======================================================");

        int nilaiFibonacchi = fibonacchi(5);
        System.out.println("Nilai fibonacchi adalah: " + nilaiFibonacchi);

        System.out.println("=======================================================");

        int nilaiBaru = fibonacchi(nilai);
        System.out.println("Nilai fibonacchi inputan user adalah: " + nilaiBaru);

        System.out.println("=======================================================");

        System.out.println("Im fucked up");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(i == j){
                    break;
                }
                System.out.print("* ");

            }
            System.out.println();
        }
        input.close();

    }

    private static int fibonacchi(int n){
        if(n == 1 || n == 0){
            return n;
        }
        return fibonacchi(n-1) + fibonacchi(n - 2);

    }
}
