package com.mycompany.longquiz4;

import java.util.Scanner;

public class LongQuiz4 {

    public static String daysOfWeek(int day) {
        switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Monday";
            case 4:
                return "Tuesday";
            case 5:
                return "Monday";
            case 6:
                return "Tuesday";
            case 7:
                return "Tuesday";
            default:
                return "Error";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = 0;

        System.out.print("Enter number >>: ");
        day = in.nextInt();
        System.out.println(daysOfWeek(day));
    }
}
