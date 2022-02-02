import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
public class CharacterStream {
    public static void main(String[] args) throws IOException {
        System.out.println("Program Input File");
        //Membuka file

        //byte stream == FileInputStream
        //Character stream == FileReader
        FileInputStream inputByte = new FileInputStream("input");
        FileReader charFile = new FileReader("input");

        //Membaca file
        System.out.println();
        System.out.println((char)inputByte.read());
        System.out.println((char)inputByte.read());
        System.out.println((char)inputByte.read());
        System.out.println((char)inputByte.read());
        System.out.println((char)inputByte.read());
        System.out.println((char)inputByte.read() + "\n");
        batas();
        System.out.println();
        System.out.println((char)charFile.read());
        System.out.println((char)charFile.read());
        System.out.println((char)charFile.read());
        System.out.println((char)charFile.read());
        System.out.println((char)charFile.read());
        System.out.println((char)charFile.read() + "\n");

        //Menutup file
        inputByte.close();
        charFile.close();

        System.out.println("Akhir Program.");
    }

    static void batas(){
        System.out.println("==========================================================================================");
    }
}
