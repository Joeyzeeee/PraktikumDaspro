package Praktikum10;

import java.util.Scanner;

public class BioskoptWithScanner09 {

    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);
        String[][] penonton = new String[4][2];

        while (true) {

            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("        PEMILIHAN MENU         ");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu yang tersedia(1-3): ");
            int pilihan = input09.nextInt();
            input09.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    String nama = input09.nextLine();

                    int baris, kolom;
                    while (true) {
                        System.out.print("Masukkan baris (1-4): ");
                        baris = input09.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = input09.nextInt();
                        input09.nextLine();

                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("Baris dan kolom harus dalam range yang valid (1-4 untuk baris, 1-2 untuk kolom).");
                        } else if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Bangku sudah terisi. Silakan pilih tempat yang lain.");
                        } else {
                            break; 
                        }
                        System.out.println("");
                    }

                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("Data penonton telah ditambahkan.");
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("");
                    System.out.println("-=-=-=- Daftar Penonton -=-=-=-");
                    System.out.println("");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] != null) {
                                System.out.println("Baris kursi ke-" + (i + 1) + ", Kolom kursi ke-" + (j + 1) + ": " + penonton[i][j]);
                            } else {
                                System.out.println("Baris kursi ke-" + (i + 1) + ", Kolom kursi ke-" + (j + 1) + ": ***");
                            }
                        }
                        System.out.println("");
                    }
                    break;

                case 3:
                    System.out.println("");
                    System.out.println("Thank you and have a nice day!!!");
                    System.out.println("");
                    input09.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang benar.");
                    break;
            }
        }
    }
}
