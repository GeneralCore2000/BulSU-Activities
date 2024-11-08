package com.mycompany.activity5;

import java.util.Scanner;

public class Activity5 {

    public static void main(String[] args) {
        int multiplicand = 0, multiplier = 0, product = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Multiplicand\t:\t");
        multiplicand = in.nextInt();
        System.out.print("Multiplier\t:\t");
        multiplier = in.nextInt();
        System.out.println("--------------------------------------");

        if (multiplicand < 0 || multiplier < 0) {
            System.err.println("Negative number/s not accepted");
        } else {
            for (int i = 0; i < multiplier; i++) {
                product += multiplicand;
            }
            System.out.println("Product\t\t:\t" + product);
        }
    }
}
