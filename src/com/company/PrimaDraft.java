import java.util.Scanner;
public class PrimaDraft {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Menentukan Bilangan Prima.");
        int i, j = 0, n;

        System.out.print("Masukkan Nilai: ");
        n = input.nextInt();
        input.close();


        if (n == 1) {
            System.out.println("Nilai yang dimasukkan tidak valid.");
        } else if (n <= 0) {
            System.out.println("Nilai yang dimasukkan tidak valid.");
        }


        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                j += 1;
            }
        }

        System.out.println("--------------------------------------------------------");
        if (j == 2) {
            System.out.println(n + " Merupakan bilangan Prima.");
        } else {
            System.out.println(n + " Bukan bilangan Prima");
        }

    }
}
