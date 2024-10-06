package Praktikum06;

import java.util.Scanner;

public class TanpaOperatorLogika09 {

    public static void main(String[] args) {

        Scanner input09 = new Scanner(System.in);

        System.out.println("Masukkan bilangan 1 : ");
        int a = input09.nextInt();
        System.out.println("Masukkan bilangan 2 : ");
        int b = input09.nextInt();
        System.out.println("Masukkan bilangan 3 : ");
        int c = input09.nextInt();

        int maksimal = a;

        if (b > maksimal) {
            maksimal = b;

        }
        if (c > maksimal) {
            maksimal = c;

            input09.close();
        }

        System.out.println("Bilangan terbesar adalah " + maksimal);

    }

}
