package Homework;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        triangle();
    }

    public static void triangle() {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n=scan.nextInt();
        for (int i = 1; i < n; i++) {// outer loop running no "n" number of times
            for (int j = 1; j <= i; j++) {// inner loop running  till value of j greater than i
                System.out.print("*");

            }
            System.out.println("");// control goes to next line
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println("");
        }
        scan.close();
    }
}
