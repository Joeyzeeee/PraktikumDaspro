package Praktikum06;

import java.util.Scanner;

public class Pemilihan2Percobaan109 {

    public static void main(String[] args) {

        Scanner input09 = new Scanner(System.in);

        System.out.println("Masukkan Tahun: ");
        int tahun = input09.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) == 0) {
                if ((tahun % 400) == 0)
                    System.out.println("Tahun Kabisat");
                else
                    System.out.println("Bukan Tahun Kabisat");
            } else {
                System.out.println("Tahun Kabisat");
            }
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }

        input09.close();
    }
}
