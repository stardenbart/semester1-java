package com.string;
import java.lang.StringBuilder;
import java.util.Formatter;
public class FormatStringOp {
    public static void main(String[] args) {
        System.out.println("Program Format String.");
        batas();

        String nama = "Faruq";
        int umur = 18;
        System.out.println("Nama saya adalah " + nama + ", umur saya adalah " + umur);

        batas();
        //Cara lain dengan Format String;
        System.out.printf("Nama saya adalah %s, umur saya adalah %d\n",nama,umur);

        //Conversion = f = floating, d = integer, s = string, c = character, b = boolean, % = persen;

        //Struktur Format = %conversion (float, integer, string, character, boolean);
        //                = %[argumen_index$][flags][width][.precision]conversion;

        //[argumen.index$]
        System.out.println("\n[argumen index$]");
        System.out.printf("%1$s, wahai %1$s, kemana saja kamu %1$s\n",nama);

        //umur faruq berapa?, faruq menjawab 18, wah muda ya umurnya 18;
        System.out.printf("\numur %1$s berapa? \n%1$s menjawab %2$d, \nwah muda ya umurnya %2$d",nama,umur);
        System.out.println();

        //[flags]
        System.out.println("\n[flags]");
        int nilai1 = 5;
        int nilai2 = 8;
        int hasil = nilai1 - nilai2;
        System.out.printf("%d - %d = %+d\n",nilai1,nilai2,hasil);

        //[width]
        System.out.println("\n[width]");
        int nilai3 = 1000;
        System.out.println("INTEGER");
        System.out.printf("%d\n", nilai3);
        System.out.printf("%10d\n", nilai3);
        System.out.printf("%-10d\n", nilai3);   //flags "-", artinya rata kiri
        System.out.printf("%+10d\n", nilai3);   //flags akan mengambil slot di dalam format
        System.out.printf("%+-10d\n", nilai3);  //flags bisa digabung
        System.out.printf("%010d\n", nilai3);   //flags kita kasi leading "0" di depannya
        System.out.printf("%+010d\n", nilai3);
        int nilai4 = 1000000000;
        System.out.printf("%-,15d\n", nilai4);  //flags ",", menandakan delimeter per seribu

        System.out.println("FLOATING POINT");
        float float1 = 1.543f;
        System.out.printf("%f\n",float1);
        System.out.printf("%9f\n",float1);  //floating point akan mengambil width dengan 6 desimal

        //[,precision]
        System.out.println("\n[.precision]");
        float float2 = 15.678f;
        System.out.printf("%f\n",float2);
        System.out.printf("%.1f\n",float2);
        System.out.printf("%.2f\n",float2);
        System.out.printf("%8.2f\n",float2);    //gabungkan dengan width
        System.out.printf("%+08.2f\n",float2);   //gabungkan dengan width flags

        //CONTOH
        batas(); batas();
        System.out.println("CONTOH FORMAT STRING: ");
        String nama2 = "Abdullah";
        float ipk = 3.785432524354325f;
        System.out.printf("IPK %1$s berapa?, \nIPK %1$s adalah %2$+5.2f, \nwahh, besar juga IPK %1$s yaitu %2$+.2f\n",nama2,ipk);
        batas();
        System.out.printf("IPK %1$s berapa?, \nIPK %1$s adalah %2$+5.2f, \nwahh, besar juga IPK %1$s yaitu %2$+.2f\n",nama,ipk);

        //Kesimpulan
        //Save Format tersebut ke dalam variabel string
        batas();
        String infoBiasa = "Nama: " + nama2 + " memiliki IPK: " + ipk;
        System.out.println(infoBiasa);

        String infoFormat = String.format("Nama: %s memiliki IPK: %+5.2f",nama2, ipk);
        System.out.println(infoFormat);

        //Save Format ke StringBuilder
        batas(); batas();
        StringBuilder info = new StringBuilder();
        Formatter formatBuilder = new Formatter(info);

        formatBuilder.format("Nama: %s memiliki IPK: %+5.2f",nama2, ipk);
        System.out.println("StringBuilder Formatter: \n" + info);

        formatBuilder.close();
    }

    private static void batas(){
        System.out.println("==============================================");
    }
}
