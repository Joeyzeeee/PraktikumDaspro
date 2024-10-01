import java.util.Scanner;

public class usia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan usia anda");

        if (sc.hasNextInt()) {
            int usia = sc.nextInt();

            if (usia >= 0) {

                if (usia <= 12) {
                    System.out.println("Kategori : anak");

                } else if (usia <= 19) {
                    System.out.println("Kategori : remaja");

                } else if (usia <= 64) {
                    System.out.println("Kategori : dewasa");

                } else {
                    System.out.println("Kategori : lansia");

                }

            } else {
                System.out.println("Error : Usia harus angka positif.");

            }

        } else {
            System.out.println("Error : Input tidak valid. Masukkan (angka) positif.");
        }

        sc.close();

    }

}
