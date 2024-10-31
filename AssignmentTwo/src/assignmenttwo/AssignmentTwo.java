package assignmenttwo;

import java.util.Scanner;

/*
Instruction:
    Using If else. Create a program that will compute grade.
    If grade >=75 Print Passed
    else Print Failed
 */
public class AssignmentTwo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int grade = 0;

        System.out.print("Enter grade >>: ");
        grade = in.nextInt();

        if (grade >= 75) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
}
