package Praktikum03;

import java.util.Scanner;

public class Karyawan09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Masukkan jumlah jam kerja: ");
        int jamKerja = sc.nextInt();

        System.out.print("Masukkan upah per jam: ");
        double upahPerJam = sc.nextDouble();

        // gaji bulanan
        double gaji = jamKerja * upahPerJam;

        // bonus
        double bonus = 0.10 * gaji;

        // total sebelum pajak
        double totalSebelumPajak = gaji + bonus;

        // pajak
        double pajak = 0.05 * totalSebelumPajak;

        // total setelah pajak
        double totalSetelahPajak = totalSebelumPajak - pajak;

        // Output hasil
        System.out.println("Gaji bulanan sebelum pajak: " + gaji);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total sebelum pajak: " + totalSebelumPajak);
        System.out.println("Pajak: " + pajak);
        System.out.println("Total setelah pajak: " + totalSetelahPajak);

        sc.close();
    }
}