package com.array;
public class MethodExample {
    public static void main(String[] args){
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        double[] suhu = {29.2, 33.2, 31.2, 30.2, 29.5, 30.3, 31.6};

        cekSuhu(suhu);
        cekHari(hari, suhu);
    }

    static void cekSuhu(double[] suhu){
        double min = suhu[0];

        for(double cek : suhu){
            if(min < cek){
                cek = min;
            }
        }
        System.out.println("Suhu terendah " + min + " derajat celcius.");
    }

    static void cekHari(String[] hari, double[] suhu){
        double min = suhu[0];
        double max = suhu[0];
        int indexmin = 0;
        int indexmax = 0;

        for(int i = 0; i < suhu.length; i++){
            if(suhu[i] < min){
                min = suhu[i];
                indexmin = i;
            }if(suhu[i] > max){
                max = suhu[i];
                indexmax = i;
            }
        }

        System.out.println("Suhu terendah adalah " + min + " derajat celcius pada hari " + hari[indexmin]);
        System.out.println("Suhu tertinggi adalah " + max + " derajat celcius pada hari " + hari[indexmax]);
    }
} 