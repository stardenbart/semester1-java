package com.tugas;

public class TugasMethodSegitiga {
    public static void main(String[] args){
        System.out.println("Program Set dan Get Segitiga Beserta Luas.");
        System.out.println("============================================================");
        class Segitiga{
            private int alas;
            private int tinggi;

            public void setAlas(int atu){
                this.alas = atu;
            }

            public void setTinggi(int tinggi){
                this.tinggi = tinggi;
            }

            public int getAlas(){
                return alas;
            }

            public int getTinggi() {
                return tinggi;
            }

            public int luasSegitiga(){
                int luas = (alas * tinggi) / 2;
                return luas;
            }
        }

        Segitiga a = new Segitiga();
        a.setAlas(6);
        a.setTinggi(12);

        System.out.println("Segitiga dengan alas: " + a.getAlas() + " cm dan tinggi " + a.getTinggi() + " cm.");
        System.out.println();
        System.out.println("Luas segitiga tersebut adalah: " + a.luasSegitiga());
        System.out.println();
        System.out.println("Akhir Program.");
        
    }
}
