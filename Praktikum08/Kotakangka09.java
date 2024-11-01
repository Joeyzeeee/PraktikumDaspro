package Praktikum08;

import java.util.Scanner;

public class Kotakangka09 {

    public static void main(String[] args) {

        Scanner input09 = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = input09.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                    System.out.print(N + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        input09.close();
    }

}
