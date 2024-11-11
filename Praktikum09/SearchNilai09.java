package Praktikum09;

import java.util.Scanner;

public class SearchNilai09 {

    public static void main(String[] args) {

        Scanner input09 = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang diinput: ");
        int banyakNilai = input09.nextInt();

        int[] arrNilai = new int[banyakNilai];

        for (int i = 0; i < banyakNilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            arrNilai[i] = input09.nextInt();
        }

        System.out.print("Masukkkan nilai yang dicari : ");
        int key = input09.nextInt();
        int hasil = -1;

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i + 1;
                break;

            }
        }
        if (hasil != -1) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + hasil);
        } else {
            System.out.println("Nilai " + key + " tidak ditemukan.");
        }

        input09.close();
    }

}
