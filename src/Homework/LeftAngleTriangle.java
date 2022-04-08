package Homework;

import java.util.Scanner;

/*
15. Display left angle triangle of * using nested for loops
 */
public class LeftAngleTriangle {
    public static void main(String[] args) {
        triangle();
    }
 public static void triangle(){
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter no of row");
     int n=scan.nextInt();

     for (int i = 1; i < n; i++) {// outer loop till "n" number times
         for (int j = 1; j <= i; j++) { // inner loop till condition become false
             System.out.print("*");

         }
         System.out.println("");
     }
 }
}
