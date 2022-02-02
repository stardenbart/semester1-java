import java.util.*;
public class RataRataDraft {
    public static void main(String[] args) {
        System.out.println("Program Menentukan Rata - Rata Data yang Diinput.");
        Scanner put = new Scanner(System.in);

        double i, j, n;
        double sum = 0;

        System.out.print("Banyaknya data: ");
        n = put.nextDouble();

        put.close();

        for(i = 1; i <= n; i++) {
            j = put.nextDouble();
            sum += j;
        }
        

        System.out.println("-----------------------------------------------------");
        System.out.println("Jumlah data: " + sum);
        System.out.println("Rata - rata data: " + sum/n);

    }
}

