package Praktikum08;

import java.util.Scanner;

public class RataNilai09 {

    public static void main(String[] args) {

        Scanner input09 = new Scanner(System.in);

        int i = 1, nilaiMhs;
        while (i <= 5) {
            float totalNilai = 0, rataNilai;
            System.out.println("Input Nilai Mahasiswa ke-" + i);
            totalNilai = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print("Nilai ke-" + j + " = ");
                nilaiMhs = input09.nextInt();
                totalNilai += nilaiMhs;
            }
            rataNilai = totalNilai / 5;
            i++;
            System.out.println("Rata-rata Nilai mahasiswa ke-" + i + "adalah " + rataNilai);

        }
        input09.close();
    }

}
