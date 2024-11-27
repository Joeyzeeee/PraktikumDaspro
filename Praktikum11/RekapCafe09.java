package Praktikum11;

import java.util.Scanner;

public class RekapCafe09 {

    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = input09.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = input09.nextInt();
        input09.nextLine();
        

        int[][] dataPenjualan = inputDataPenjualan(jumlahMenu, jumlahHari, input09);
        tampilkanDataPenjualan(dataPenjualan, jumlahMenu, jumlahHari);
        menuTertinggi(dataPenjualan, jumlahMenu, jumlahHari);
        rataRataPenjualan(dataPenjualan, jumlahMenu, jumlahHari);

        input09.close();
    }

    // Fungsi untuk menginputkan data penjualan
    public static int[][] inputDataPenjualan(int jumlahMenu, int jumlahHari, Scanner input) {
        int[][] dataPenjualan = new int[jumlahMenu][jumlahHari];

        for (int i = 0; i < jumlahMenu; i++) {
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("Masukkan jumlah penjualan untuk menu ke-" + (i + 1) + " hari ke-" + (j + 1) + ": ");
                dataPenjualan[i][j] = input.nextInt();
            }
        }

        return dataPenjualan;
    }

    // Fungsi untuk menampilkan seluruh data dari hari pertama hingga hari terakhir
    public static void tampilkanDataPenjualan(int[][] dataPenjualan, int jumlahMenu, int jumlahHari) {
        System.out.println("");
        System.out.println("\n==== Data Penjualan untuk Setiap Menu Selama " + jumlahHari + " Hari ====");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.println("Menu ke-" + (i + 1) + ":");
            for (int j = 0; j < jumlahHari; j++) {
                System.out.println("  Hari ke-" + (j + 1) + ": " + dataPenjualan[i][j]);
            }
        }
    }

    // Fungsi untuk menampilkan menu yang memiliki penjualan tertinggi
    public static void menuTertinggi(int[][] dataPenjualan, int jumlahMenu, int jumlahHari) {
        System.out.println("");
        System.out.println("\n==== Penjualan Tertinggi ====");

        int maxPenjualan = 0;
        int menuTertinggi = 0;

        for (int i = 0; i < jumlahMenu; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < jumlahHari; j++) {
                totalPenjualan += dataPenjualan[i][j];
            }
            if (totalPenjualan > maxPenjualan) {
                maxPenjualan = totalPenjualan;
                menuTertinggi = i + 1;
            }
        }

        System.out.println("Menu dengan penjualan tertinggi adalah Menu ke-" + menuTertinggi
                + " dengan total penjualan: " + maxPenjualan);
    }

    // Fungsi untuk menampilkan rata-rata penjualan untuk setiap menu
    public static void rataRataPenjualan(int[][] dataPenjualan, int jumlahMenu, int jumlahHari) {
        System.out.println("");
        System.out.println("\n==== Rata-Rata Penjualan ====");
        for (int i = 0; i < jumlahMenu; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < jumlahHari; j++) {
                totalPenjualan += dataPenjualan[i][j];
            }
            double rataRata = (double) totalPenjualan / jumlahHari;
            System.out.println("Rata-rata penjualan untuk menu ke-" + (i + 1) + " adalah: " + rataRata);
        }
    }
}
