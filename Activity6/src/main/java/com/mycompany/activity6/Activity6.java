package com.mycompany.activity6;

import java.util.Scanner;

public class Activity6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dividend = 0, divisor = 0, quotient = 0, remainder = 0;

        System.out.print("Dividend\t:\t");
        dividend = in.nextInt();
        System.out.print("Divisor \t:\t");
        divisor = in.nextInt();
        System.out.println("---------------------------------------------");

        if (divisor <= 0 || dividend <= 0) {
            System.out.println("Zero/Negative number/s not accepted");
        } else if (divisor > dividend) {
            System.out.println("    Unable to Process");
        } else {
            int i = divisor;
            while (i <= dividend) {
                quotient++;
                i += divisor;
            }
            System.out.println("Quotient\t:\t" + quotient);
            if (quotient * divisor < dividend) {
                remainder = dividend - (quotient * divisor);
                System.out.println("Remainder\t:\t" + remainder);
            }
        }
    }
}
