package Praktikum11;

import java.util.Scanner;

public class Kubus09 {

    static int hitungVolume(int sisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }

    static int luasPermukaan(int sisi) {
        int Luas = 6 * sisi * sisi;
        return Luas;
    }

    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        int sisi, volume, luasPermukaan;
        System.out.print("Masukkan panjang sisi : ");
        sisi = input09.nextInt();

        volume = hitungVolume(sisi);
        System.out.println("Volume kubus adalah " + volume);

        luasPermukaan = luasPermukaan(sisi);
        System.out.println("Luas Permukaan kubus adalah " + luasPermukaan);

        input09.close();
    }

}
