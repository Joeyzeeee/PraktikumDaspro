package Praktikum10;

import java.util.Scanner;

public class Survey09 {

    public static void main(String[] args) {

        Scanner input09 = new Scanner(System.in);
        int[][] survey = new int[10][6];

        System.out.println("=======================================================");
        System.out.println("            SURVEI KEPUASAN PELANGGAN ");
        System.out.println("=======================================================");
        System.out.println();
        System.out.println("Masukkan hasil survei dengan nilai 1-5 : ");
        for (int i = 0; i < survey.length; i++) {
            System.out.println("Responden " + (i + 1) + ":");
            for (int j = 0; j < survey[i].length; j++) {
                while (true) {
                    System.out.print((j + 1) + ". Pertanyaan " + (j + 1) + ": ");
                    survey[i][j] = input09.nextInt();
                    if (survey[i][j] > 5 || survey[i][j] < 1) {
                        System.out.println("Nilai tidak sesuai, harap isi kembali");
                    } else {
                        break;
                    }
                }

            }
        }

        System.out.println();
        System.out.println("=========================");
        System.out.println("    HASIL RATA-RATA");
        System.out.println("=========================");
        System.out.println("Rata-rata nilai per Responden :");
        System.out.println();
        for (int i = 0; i < survey.length; i++) {
            int RataResponden = 0;
            for (int j = 0; j < survey[i].length; j++) {
                RataResponden += survey[i][j];
            }
            double HasilRataResponden = (double) RataResponden / survey[i].length;
            System.out.println((i + 1) + ". Responden " + (i + 1) + " : " + HasilRataResponden);
        }

        System.out.println();
        System.out.println("Rata-rata nilai per Pertanyaan:");
        for (int j = 0; j < survey[0].length; j++) {
            int RataPertanyaan = 0;
            for (int i = 0; i < survey.length; i++) {
                RataPertanyaan += survey[i][j];
            }
            double HasilRataPertanyaan = (double) RataPertanyaan / survey.length;
            System.out.println((j + 1) + ". Responden " + (j + 1) + " : " + HasilRataPertanyaan);
        }

        int TotalRata = 0;
        int JumlahElemen = survey.length * survey[0].length;
        for (int i = 0; i < survey.length; i++) {
            for (int j = 0; j < survey[i].length; j++) {
                TotalRata += survey[i][j];
            }
        }
        double RataKeseluruhan = (double) TotalRata / JumlahElemen;
        System.out.println("Rata-rata keseluruhan nilai adalah : " + RataKeseluruhan);

        input09.close();
        ;
    }
}
