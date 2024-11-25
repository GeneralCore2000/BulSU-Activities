package com.mycompany.activity7;

import java.util.Scanner;

public class Activity7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = 0, ctr = 0;

        System.out.print("Input\t:\t");
        input = in.nextInt();

        System.out.println("Output 1:");
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "\t");
            }
            System.out.println("");
        }

        System.out.println("\nOutput 2:");
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                ctr++;
                System.out.print(ctr + "\t");
            }
            System.out.println("");
        }
    }
}
