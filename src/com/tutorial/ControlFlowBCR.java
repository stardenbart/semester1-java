

public class ControlFlowBCR {
    public static void main(String[] args) {

        //break, continue, and return

        int a = 0;

        while(true){
            a++;
            if(a == 10){
                break;
                // ini adalah keyword untuk memaksa keluar dari loop
            }else if(a == 5){
                continue;
                // ini adalah keyword untuk memaksa memulai aksi dari awal
            }else if(a == 7){
                return;
                // ini adalah keyword untuk keluar dari psvm
            }
            System.out.println("Looping ke -" + a);
        }

        System.out.println("Akhir dari Looping");
    }
}
