package Praktikum11;

import java.util.Scanner;

public class Percobaan6ke209 {

    public static int hitungLuas(int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }

    public static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);
        int p, l, t, L, vol;
        System.out.print("Masukkan panjang: ");
        p = input09.nextInt();
        System.out.print("Masukkan lebar: ");
        l = input09.nextInt();
        System.out.print("Masukkan tinggi: ");
        t = input09.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas Persegi Panjang adalah " + L);
        vol = hitungVolume(t, l, p);
        System.out.println("Volume Balok adalah " + vol);

        input09.close();

    }

}
