import java.util.Scanner;
public class RemainderDraft {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Mencari Sisa Hasil Bagi.");

        float k, l;
        System.out.print("Masukkan bilangan pembilang: ");
        k = input.nextFloat();
        System.out.print("Masukkan bilangan pembagi: ");
        l = input.nextFloat();

        System.out.println("-----------------------------------------------------------");
        float n = k % l;
        System.out.println("Modulus dari " + k + " terhadap " + l + " adalah: " + n);

        input.close();
    }
}
