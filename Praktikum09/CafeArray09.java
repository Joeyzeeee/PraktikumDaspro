package Praktikum09;

import java.util.Scanner;

public class CafeArray09 {

    public static void main(String[] args) {

        Scanner input09 = new Scanner(System.in);

        String[] daftarMenu = { "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino",
                "Chocolate Ice" };
        double[] daftarHarga = { 20000, 22000, 15000, 17000, 13000, 18000, 20000 };

        System.out.print("Jumlah (jenis menu) yang ingin anda dipesan: ");
        int jumlahPesanan = input09.nextInt();
        input09.nextLine();

        String[] namaPesanan = new String[jumlahPesanan];
        int[] jumlahItemPesanan = new int[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Nama menu yang dipilih: ");
            String namaMenu = input09.nextLine();

            int indexMenu = 0;
            for (int j = 0; j < daftarMenu.length; j++) {
                if (daftarMenu[j].equalsIgnoreCase(namaMenu)) {
                    indexMenu = j;
                    break;
                }
            }

            if (indexMenu != -1) {
                System.out.print("Jumlah " + namaMenu + " yang ingin dipesan: ");
                int jumlah = input09.nextInt();
                input09.nextLine();

                namaPesanan[i] = namaMenu;
                jumlahItemPesanan[i] = jumlah;
                hargaPesanan[i] = daftarHarga[indexMenu] * jumlah;

                System.out.println("Pesanan " + namaMenu + " berhasil ditambahkan.");
            } else {
                System.out.println("Menu " + namaMenu + " tidak tersedia.");
                i--;
            }
        }

        double totalHarga = 0;
        System.out.println("");
        System.out.println("   |-=-=-= Daftar Pesanan Kamu =-=-=-|");
        System.out.println("");
        for (int i = 0; i < jumlahPesanan; i++) {
            if (namaPesanan[i] != null) {
                System.out.println(namaPesanan[i] + " x " + jumlahItemPesanan[i] + " = Rp " + hargaPesanan[i]);
                totalHarga += hargaPesanan[i];
            }
        }

        System.out.println("Total harga yang perlu dibayar: Rp " + totalHarga);
        System.out.println("");
        System.out.println("|-=-=-= Thank you Have a Nice Day! =-=-=-|");
        System.out.println("");

        input09.close();
    }
}
