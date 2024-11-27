package Praktikum11;

import java.util.Scanner;

public class Percobaan609 {

    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        int p,l,t,L,vol;

        System.out.print("Masukkan panjang: ");
        p = input09.nextInt();
        System.out.print("Masukkan lebar: ");
        l = input09.nextInt();
        System.out.print("Masukkan tinggi: ");
        t = input09.nextInt();

        L = p*l;
        System.out.println("Luas Persegi panjang adalah "+L);

        vol = p*l*t;
        System.out.println("Volume balok adalah "+vol);

        input09.close();
    }
    
}
