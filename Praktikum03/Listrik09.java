package Praktikum03;

import java.util.Scanner;

public class Listrik09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double tarifListrik, penggunaanListrik, tagihan, listrikLebih;
        // boolean lebih = true, tidak = false;

        listrikLebih = 500;
        tarifListrik = 1500;

        System.out.println("Masukkan jumlah penggunaan listrik (kWh)");
        penggunaanListrik = sc.nextDouble();

        tagihan = penggunaanListrik * tarifListrik;
        System.out.println("Berikut merupakan tagihan listrik anda : " + tagihan);

        System.out.println(("Apakah lebih dari 500kWh?: ") + (listrikLebih < penggunaanListrik));

        sc.close();
    }

}
