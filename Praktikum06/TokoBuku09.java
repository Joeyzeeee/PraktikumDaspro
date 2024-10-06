package Praktikum06;

import java.util.Scanner;

public class TokoBuku09 {

    public static void main(String[] args) {

        Scanner input09 = new Scanner(System.in);

        System.out.println("");
        System.out.println("----------------------------------------");
        System.out.println("=== SELAMAT DATANG DI TOKO BUKU KAMI ===");
        System.out.println("----------------------------------------");

        System.out.println("");

        System.out.print("Masukkan hari pembelian: ");
        String hari = input09.nextLine().toLowerCase();

        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        String jenisBuku = input09.nextLine().toLowerCase();

        System.out.print("Masukkan jumlah buku yang dibeli: ");
        int jumlahBuku = input09.nextInt();

        double diskon = 0;

        if (hari.equals("rabu")) {

            if (jenisBuku.equals("kamus")) {

                diskon = 10;

                if (jumlahBuku > 2) {
                    diskon += 2;
                }
            } else if (jenisBuku.equals("novel")) {
                diskon = 7;
                if (jumlahBuku > 3) {
                    diskon += 2;
                } else {
                    diskon += 1;
                }
            } else {
                if (jumlahBuku > 3) {
                    diskon = 5;
                }
            }
        } else {
            diskon = 0;
            System.out.println("Diskon hanya berlaku pada hari Rabu.");
        }
        System.out.println("Total diskon yang diberikan adalah: " + diskon + "%");
        System.out.println("");
        System.out.println(" =-=- TERIMA KASIH SUDAH BERBELANJA -=-= ");
        System.out.println("");

        input09.close();
    }
}
