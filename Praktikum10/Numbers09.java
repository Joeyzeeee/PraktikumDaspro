package Praktikum10;

import java.util.Arrays;
import java.util.Scanner;

public class Numbers09 {

    public static void main(String[] args) {

        Scanner input09 = new Scanner(System.in);

        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }
        input09.close();
    }

}
