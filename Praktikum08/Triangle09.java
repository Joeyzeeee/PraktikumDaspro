package Praktikum08;

import java.util.Scanner;

public class Triangle09 {

    public static void main(String[] args) {

        Scanner input09 = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = input09.nextInt();
        int i = 0;
        while (i <= N) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            // System.out.println();
            i++;

            input09.close();
        }

    }

}