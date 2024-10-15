package Praktikum07;

import java.util.Scanner;

public class CafeDoWhile09 {

    public static void main(String[] args) {

        Scanner input09 = new Scanner(System.in);

        int kopi, teh, roti;
        String namaPelanggan;
        double hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000, totalHarga;

        do {
            System.out.println("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = input09.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.println("Jumlah Kopi: ");
            kopi = input09.nextInt();
            System.out.println("Jumlah Teh: ");
            teh = input09.nextInt();
            System.out.println("Jumlah Roti: ");
            roti = input09.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            input09.nextLine();
        } while (true);

        System.out.println("Semua transaksi selesai");

        input09.close();

    }

}
