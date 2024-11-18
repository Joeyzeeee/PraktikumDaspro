package Praktikum10;

import java.util.Scanner;

public class SIAKAD09 {

    public static void main(String[] args) {

        Scanner input09 = new Scanner(System.in);

        System.out.println("Masukkan jumlah baris : ");
        int baris = input09.nextInt();
        System.out.println("Masukkan jumlah kolom : ");
        int kolom = input09.nextInt();

        int[][] nilai = new int[baris][kolom];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = input09.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Nilai rata-rata: " + totalPerSiswa / kolom);

        }
        System.out.println("");
        System.out.println("=======================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah:");

        for (int j = 0; j < kolom; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < baris; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Nilai Mata kuliah " + (j + 1) + ": " + totalPerMatkul / baris);

        }
        input09.close();

    }
}
