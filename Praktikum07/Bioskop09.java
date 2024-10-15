package Praktikum07;

import java.util.Scanner;

public class Bioskop09 {

    public static void main(String[] args) {

        Scanner input09 = new Scanner(System.in);

        int totalTiketTerjual = 0;
        double totalPendapatan = 0;
        final int hargaTiket = 50000;

        while (true) {
            System.out.println("Masukkan jumlah tiket yang anda beli (type '0' untuk selesai)");
            int jumlahTiket = input09.nextInt();

            if (jumlahTiket == 0) {
                break;

            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid!!! (masukkan angka positif)");
                continue;

            }

            double totalHarga = jumlahTiket * hargaTiket;

            if (jumlahTiket > 10) {
                totalHarga *= 0.85;
            } else if (jumlahTiket > 4) {
                totalHarga *= 0.90;
            }

            totalTiketTerjual += jumlahTiket;
            totalPendapatan += totalHarga;

            System.out.println("Total harga untuk " + jumlahTiket + " tiket : " + jumlahTiket + totalHarga);
        }

        System.out.println("==== Rekap penjualan hari ini ====");
        System.out.println("Total tiket terjual : " + totalTiketTerjual);
        System.out.println("Total pendapatan : " + totalPendapatan);

        input09.close();

    }

}
