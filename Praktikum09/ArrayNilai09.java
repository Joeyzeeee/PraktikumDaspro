package Praktikum09;

import java.util.Scanner;

public class ArrayNilai09 {

    public static void main(String[] args) {

        Scanner input09 = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-" + i + " : ");
            nilaiAkhir[i] = input09.nextInt();
        }

        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + i + " lulus!!");
            } else if (nilaiAkhir[i] < 70) {
                System.out.println("Mahasiswa ke-" + i + " tidak lulus!!");
            }

        }
        input09.close();
    }

}
