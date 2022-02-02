package com.tugas;
public class DraftAwalTugas {

    public static void main(String[] args) {
        class Segitiga{

            private int lebar;
            private int tinggi;
            private int luas;

            public void setLebar(int lebar){
                this.lebar = lebar;
            }

            public int getLebar(){
                return lebar;
            }

            public void setTinggi(int tinggi){
                this.tinggi = tinggi;
            }

            public int getTinggi(){
                return tinggi;
            }

            public int hitungLuas(){
                luas = (lebar * tinggi) / 2;
                return luas;
            }
        }


        Segitiga a = new Segitiga();

        a.setLebar(6);
        a.setTinggi(5);
        System.out.println("Luas segitiga tersebut adalah: " + a.hitungLuas());
        System.out.println("Segitiga dengan lebar = " + a.getLebar() + " dan tinggi " + a.getTinggi());
    }
}
