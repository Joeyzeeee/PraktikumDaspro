package Praktikum07;

import java.util.Scanner;

public class SiakadFor09 {

    public static void main(String[] args) {

        Scanner input09 = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int jumlahTidakLulus = 0, jumlahLulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Masukkan nilai Mahasiswa ke-" + i + ": ");
            nilai = input09.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;

            }
            if (nilai < terendah) {
                terendah = nilai;

            }

            if (nilai < 60) {
                System.out.println("Mahasiswa Tidak lulus");
                jumlahTidakLulus++;
            } else {
                System.out.println("Mahasiswa lulus");
                jumlahLulus++;
            }

        }

        System.out.println("");
        System.out.println("=== REKAP MAHASISWA ===");
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah Mahasiswa Lulus: " + jumlahLulus);
        System.out.println("Jumlah Mahasiswa Tidak Lulus: " + jumlahTidakLulus);

        input09.close();
    }
}
