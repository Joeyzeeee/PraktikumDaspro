package Praktikum06;

import java.util.Scanner;

public class Pemilihan2Percobaan309 {

    public static void main(String[] args) {

        Scanner input09 = new Scanner(System.in);

        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.println("Masukkan kategori : ");
        kategori = input09.nextLine();
        System.out.println("Masukkan Besarnya Penghasilan : ");
        penghasilan = input09.nextInt();

        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000)
                pajak = 0.1;
            else if (penghasilan <= 3000000)
                pajak = 0.15;
            else
                pajak = 0.2;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("penghasilan bersih : " + gajiBersih);
        } else if (kategori.equalsIgnoreCase("pebisnis")) {
            if (penghasilan <= 2500000)
                pajak = 0.15;
            else if (penghasilan <= 3500000)
                pajak = 0.2;
            else
                pajak = 0.25;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasilan bersih  : " + gajiBersih);
        } else
            System.out.println("Masukan kategori salah ");
        input09.close();
    }
}
