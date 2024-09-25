package Praktikum03;

import java.util.Scanner;

public class Bank09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double tabunganAwal, tabunganAkhir, bunga, persentaseBunga;
        int lamaMenabung;

        persentaseBunga = 0.00002;

        // input data

        System.out.println("Masukkan jumlah tabungan awal: ");
        tabunganAwal = sc.nextDouble();
        System.out.println("Masukkan lama menabung (bulan): ");
        lamaMenabung = sc.nextInt();

        // sistem penghitungan

        bunga = persentaseBunga * lamaMenabung * tabunganAwal;

        tabunganAkhir = tabunganAwal + bunga;

        System.out.println("bunga: " + bunga);
        System.out.println("Tabungan akhir: " + tabunganAkhir);

        sc.close();

    }

}
