public class InstansiasiArrayList {

    public static void main(String[] args) {
        System.out.println("Program Nilai UTS Mahasiswa.");
        System.out.println("==========================================================");

        class Mahasiswa{
            String nama;
            int NIM;
            private int umur;
            int nilaiUTS;

            int tahunKuliah() {
                return umur - 17;
            }

            public int setUmur(int u){
                if(u < 0) System.out.println("Umur yang dimasukkan salah");
                if(u > 100) System.out.println("Are you sure?");
                return u;
            }

            public int getUmur(){
                return setUmur(19);
            }
        }

        Mahasiswa badu = new Mahasiswa();
        badu.nama = "Badu";
        badu.NIM = 9021;
        badu.nilaiUTS = 90;
        badu.setUmur(18);

        Mahasiswa budi = new Mahasiswa();
        budi.nama = "Budi";
        budi.NIM = 9022;
        budi.nilaiUTS = 80;
        budi.setUmur(17);

        Mahasiswa bowo = new Mahasiswa();
        bowo.nama = "Bowo";
        bowo.NIM = 9023;
        bowo.nilaiUTS = 85;
        bowo.setUmur(18);

        Mahasiswa bono = new Mahasiswa();
        bono.nama = "Bonp";
        bono.NIM = 9024;
        bono.nilaiUTS = 90;
        bono.getUmur();

        System.out.println(badu.nama + " dengan umur: " + badu.NIM + " mendapatkan nilai UTS sebesar: " + badu.nilaiUTS);
        System.out.println(budi.nama + " dengan umur: " + budi.NIM + " mendapatkan nilai UTS sebesar: " + budi.nilaiUTS);
        System.out.println(bowo.nama + " dengan umur: " + budi.NIM + " mendapatkan nilai UTS sebesar: " + bowo.nilaiUTS);

        System.out.println();

        System.out.println(badu.nama + " Sudah kuliah selama " + badu.tahunKuliah() + " tahun. " +
                "\n Karena berumur ");
        System.out.println(budi.nama + " Sudah kuliah selama " + budi.tahunKuliah() + " tahun." +
                "\n Karena berumur ");
        System.out.println(bowo.nama + " Sudah kuliah selama " + bowo.tahunKuliah() + " tahun." +
                "\n Karena berumur ");


        System.out.println("==========================================================");
        System.out.println("Akhir Program.");


    }
}