package com.mycompany.activity3;

import java.util.Scanner;

public class Activity3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        char choice = ' ';
        double computedArea = 0.0, radius = 0.0, length = 0.0, width = 0.0,
                base = 0.0, height = 0.0;
        System.out.println("=================================================");
        System.out.println("                 AREA CALCULATOR");
        System.out.println("=================================================");
        System.out.print("[C] Circle\n[R] Rectangle\n[T] Triangle\n>>: ");
        choice = in.next().toUpperCase().charAt(0);
        switch (choice) {
            case 'C':
                System.out.print("Enter RADIUS >>: ");
                radius = in.nextDouble();
                computedArea = 3.14 * radius * radius;
                System.out.println("The area of the circle is: " + computedArea);
                System.err.println("Invalid Input!");
                break;
            case 'R':
                System.out.print("Enter LENGTH >>: ");
                length = in.nextDouble();
                System.out.print("Enter WIDTH >>: ");
                width = in.nextDouble();
                computedArea = length * width;
                System.out.println("The area of the rectangle is: " + computedArea);
                break;
            case 'T':
                System.out.print("Enter BASE >>: ");
                base = in.nextDouble();
                System.out.print("Enter HEIGHT >>: ");
                height = in.nextDouble();
                computedArea = 0.5 * base * height;
                System.out.println("The area of the trianglee is: " + computedArea);
                break;
            default:
                System.err.println("Select only from the choices");
        }
    }
}
