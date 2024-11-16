package Praktikum10;

import java.util.Scanner;

public class BioskoptWithScanner09 {

    public static void main(String[] args) {

        Scanner input09 = new Scanner(System.in);

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan nama: ");
            String nama = input09.nextLine();
            System.out.print("Masukkan baris: ");
            int baris = input09.nextInt();
            System.out.print("Masukkan kolom: ");
            int kolom = input09.nextInt();
            input09.nextLine();

            penonton[baris - 1][kolom - 1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            String next = input09.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;

            }

        }
        input09.close();
    }

}
