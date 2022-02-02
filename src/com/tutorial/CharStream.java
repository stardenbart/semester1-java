import java.io.*;

public class CharStream {
    public static void main(String[] args) throws IOException {

        FileInputStream byteFile = new FileInputStream("input");
        FileReader charFile = new FileReader("input");

        FileOutputStream byteOutput = new FileOutputStream("output.txt");
        FileWriter charOutput = new FileWriter("output.txt");

        int buffer = byteFile.read();

        while(buffer != -1) {
            byteOutput.write(buffer);
            buffer = byteFile.read();
        }

        byteFile.close();
        byteOutput.close();

        charFile.close();
        charOutput.close();

    }
}
