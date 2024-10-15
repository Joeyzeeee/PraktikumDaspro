package Praktikum07;

import java.util.Scanner;

public class Parkir09 {

    public static void main(String[] args) {

        Scanner input09 = new Scanner(System.in);

        double totalPembayaran = 0;

        final int tarifMobilPerJam = 3000;
        final int tarifMotorPerJam = 2000;
        final int tarifTetap = 12500;

        while (true) {
            System.out.println(" ==== Parkiran Modern ====");
            System.out.println("");
            System.out.println("Masukkan jenis kendaraan anda");
            System.out.print("1.Mobil | 2.Motor | 0.Cancel : ");

            int jenisKendaraan = input09.nextInt();

            if (jenisKendaraan == 0) {
                break;
            }

            if (jenisKendaraan != 1 && jenisKendaraan != 2) {
                System.out.println("Tidak masuk dalam jenis kendaraan yang dipilih");
                continue;

            }
            System.out.print("Masukkan durasi parkir (jam): ");
            int durasi = input09.nextInt();

            if (durasi <= 0) {
                System.out.println("Durasi parkir tidak valid!!! (silahkan masukkan angka positif)");
                continue;

            }

            double tarif;
            if (durasi > 5) {
                tarif = tarifTetap;
            } else {
                if (jenisKendaraan == 1) {
                    tarif = durasi * tarifMobilPerJam;
                } else {
                    tarif = durasi * tarifMotorPerJam;
                }

            }

            totalPembayaran += tarif;
            System.out.println("Tarif parkir : " + tarif);

            System.out.println("");
            System.out.println("==== Rekap Pembayaran Parkir ====");
            System.out.println("Total Pembayaran : " + totalPembayaran);
            break;

        }

        input09.close();

    }
}
