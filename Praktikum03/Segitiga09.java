package Praktikum03;

import java.util.Scanner;

public class Segitiga09 {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int alas, tinggi;
        float luas;

        // sistem penghitungan

        System.out.println("Masukkan alas: ");
        alas = sc.nextInt();
        System.out.println("Masukkan tinggi: ");
        tinggi = sc.nextInt();

        // Hitung nilai luas

        luas = alas * tinggi / 2;

        // Hitungan Hasil

        System.out.println("Luas segitiga: " + luas);

    }

}
