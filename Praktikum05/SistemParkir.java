
import java.util.Scanner;

public class SistemParkir {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int pilihan, durasi;

        System.out.println(" --- Selamat Datang di Sistem Parkir!!! ---  ");
        System.out.println("");
        System.out.println("Silahkan pilih jenis kendaraan anda");
        System.out.println("1.Mobil");
        System.out.println("2.Motor ");
        System.out.println("");

        System.out.println("    Masukkan pilihan anda");
        System.out.println("(1 untuk mobil, 2 untuk motor)");
        pilihan = input.nextInt();

        System.out.println("Masukkan durasi parkir (jam): ");
        durasi = input.nextInt();

        int biaya = 0;
        String jenisKendaraan;

        if (pilihan == 1) {
            biaya = 5000;
            jenisKendaraan = "Mobil";
        } else if (pilihan == 2) {
            biaya = 3000;
            jenisKendaraan = "Motor";
        } else {
            System.out.println("Pilihan tidak valid");
            input.close();
            return;
        }

        int totalBiaya = biaya * durasi;

        System.out.println("jenis kendaraan: " + jenisKendaraan);
        System.out.println("Total biaya yang harus dibayar: " + totalBiaya);

        input.close();

    }

}
