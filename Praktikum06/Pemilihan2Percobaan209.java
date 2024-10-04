package Praktikum06;

import java.util.Scanner;

public class Pemilihan2Percobaan209 {

    public static void main(String[] args) {

        Scanner input09 = new Scanner(System.in);

        int pilihanMenu;
        String member, jenisPembayaran;
        double diskon, harga, totalBayar;
        int potonganQRIS = 1000;

        System.out.println(" ------------------ ");
        System.out.println("======= MENU ======= ");
        System.out.println(" ------------------ ");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        pilihanMenu = input09.nextInt();
        System.out.println("Apakah punya member (y/n) ? =");
        member = input09.next();
        input09.nextLine();
        System.out.println("Masukkan jenis pembayaran (QRIS / tunai) = ");
        jenisPembayaran = input09.nextLine();
        System.out.println("--------------------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
        } else if (member.equalsIgnoreCase("n")) {
            diskon = 0;
            System.out.println("Besar diskon = 0%");
        } else {
            System.out.println("Member tidak valid");
            input09.close();
            return;
        }

        if (pilihanMenu == 1) {
            harga = 14000;
            System.out.println("Harga Ricebowl = " + harga);
        } else if (pilihanMenu == 2) {
            harga = 3000;
            System.out.println("Harga Ice Tea = " + harga);
        } else if (pilihanMenu == 3) {
            harga = 15000;
            System.out.println("Harga bundling = " + harga);
        } else {
            System.out.println("Masukkan pilihan menu dengan benar!!!");
            input09.close();
            return;
        }

        totalBayar = harga - (harga * diskon);

        if (jenisPembayaran.equalsIgnoreCase("QRIS")) {
            totalBayar -= potonganQRIS;
            System.out.println("Pembayaran menggunakan QRIS, potongan Rp.1.000 diterapkan.");
        }

        System.out.println("Total bayar = " + totalBayar);
        System.out.println("--------------------------------------");

        input09.close();
    }
}
