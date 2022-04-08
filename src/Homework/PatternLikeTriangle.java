package Homework;

import java.util.Scanner;

public class PatternLikeTriangle {
    //  Write a program in Java to display the pattern like a triangle with a number.
    public static void main(String[] args) {
        triangle();
    }

    public static void triangle() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); // int value stored in "n" variable
        System.out.println("Enter numnber of rows");
            // Outer loop to run no of time
        for (int i = 1; i < n; i++) {
            // inner loop to print number of row
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println("");
        }
        scan.close();// scanner closed
    }
}
