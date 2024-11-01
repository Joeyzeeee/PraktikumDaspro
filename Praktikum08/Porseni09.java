package Praktikum08;

import java.util.Scanner;

public class Porseni09 {

    public static void main(String[] args) {

        Scanner input09 = new Scanner(System.in);

        int i = 0;
        @SuppressWarnings("unused")
        String namaPoliteknik, basket, badminton, volly, tenisMeja;
        System.out.println("");
        System.out.println(" =-=-=-=-=-=-= PORSENI 2024 =-=-=-=-=-=-=");
        System.out.print("Masukkan jumlah Politeknik yang mendaftar : ");
        i = input09.nextInt();

        for (int x = 1; x <= i; x++) {

            System.out.print("Masukkan Nama Politeknik : ");
            namaPoliteknik = input09.next();
            System.out.println("");

            for (int j = 1; j < 5; j++) {
                if (j == 1) {
                    System.out.println("ATLET BASKET");
                    for (int j2 = 1; j2 <= 5; j2++) {
                        System.out.print("Masukkan nama atlet ke-" + j2 + " : ");
                        basket = input09.next();
                    }
                    System.out.println("");
                }
                if (j == 2) {
                    System.out.println("ATLET BADMINTON");
                    for (int j3 = 1; j3 <= 5; j3++) {
                        System.out.print("Masukkan nama atlet ke-" + j3 + " : ");
                        badminton = input09.next();
                    }
                    System.out.println("");
                }
                if (j == 3) {
                    System.out.println("ATLET VOLLY");
                    for (int j4 = 1; j4 <= 5; j4++) {
                        System.out.print("Masukkan nama atlet ke-" + j4 + " : ");
                        volly = input09.next();
                    }
                    System.out.println("");
                }
                if (j == 4) {
                    System.out.println("ATLET TENIS MEJA");
                    for (int j5 = 1; j5 <= 5; j5++) {
                        System.out.print("Masukkan nama atlet ke-" + j5 + " : ");
                        tenisMeja = input09.next();
                    }
                    System.out.println("");
                } else if (j > 4) {
                    x++;
                    continue;
                }
            }

        }
        input09.close();
        ;

    }

}
