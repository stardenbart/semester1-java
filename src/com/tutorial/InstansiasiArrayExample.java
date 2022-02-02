import java.util.*;
public class InstansiasiArrayExample {
    public static void main(String[] args) {
        class Mahasiswa {
            String nama;
            int umur;
            int nilaiUTS;
        }

        Mahasiswa mhs[] = new Mahasiswa[3];

        for (int i = 0; i < 3; i++){
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan nama Mahasiswa: ");
            mhs[i].nama = input.next();

            System.out.print("Masukkan nilai Mahasiswa: ");
            mhs[i].nilaiUTS = input.nextInt();

            System.out.print("Masukkan umur Mahasiswa: ");
            mhs[i].umur = input.nextInt();

            input.close();
        }

        for (int i = 0; i < mhs.length; i++){
            System.out.println(mhs[i].nama + " berumur: " + mhs[i].umur + " mendapatkan nilai UTS sebesar: " + mhs[i].nilaiUTS);
        }

    }
}
