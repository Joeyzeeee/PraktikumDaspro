package Praktikum11;

import java.util.Scanner;

public class HitungTotalHarga09 {

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = { 115000, 20000, 22000, 12000, 10000, 18000 };

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            hargaTotal = (int) (hargaTotal * 0.5);
            System.out.println("Anda mendapatkan diskon 50%!");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            hargaTotal = (int) (hargaTotal * 0.7);
            System.out.println("Anda mendapatkan diskon 30%!");
        } else {
            System.out.println("Kode promo invalid. Tidak ada diskon.");
        }

        return hargaTotal;
    }

    public static void main(String[] args) {

        Scanner input09 = new Scanner(System.in);

        int totalKeseluruhan = 0;

        while (true) {
            System.out.print("Masukkan nomor menu yang ingin Anda pesan (1-6): ");
            int pilihanMenu = input09.nextInt();

            if (pilihanMenu < 1 || pilihanMenu > 6) {
                System.out.println("Nomor menu tidak valid. Silakan pilih antara 1-6.");
                continue;
            }

            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = input09.nextInt();
            input09.nextLine();

            System.out.print("Masukkan kode promo (jika ada, tekan Enter jika tidak ada): ");
            String kodePromo = input09.nextLine();

            int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
            totalKeseluruhan += totalHarga;

            System.out.print("Apakah Anda ingin menambahkan pesanan lain? (y/n): ");
            String lanjut = input09.nextLine();

            if (lanjut.equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println("Total keseluruhan untuk semua pesanan Anda: Rp" + totalKeseluruhan);
        input09.close();
    }
}
