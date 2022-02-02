public class MethodContohDasar {
    public static void main(String[] args) {

        System.out.println(simple());

        fungsiVoid("Print apapun");
        fungsiVoid("Saya capek ngoding mohon maaf");

        selamatPagi("Joko");
        selamatPagi("Bowo");
        // void artinya hampa
    }

    private static void selamatPagi(String nama){
        System.out.println("Selamat pagi " + nama);
    }

    // fungsi atau method tanpa kembalian
    private static void fungsiVoid(String input){
        System.out.println(input);
    }

    // method atau fungsi return
    // menggunakan kembalian
    // dalam hal ini kembalian == 10.0
    private static float simple(){
        return 10.0f;
    }
}
