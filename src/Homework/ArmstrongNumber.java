package Homework;

import java.util.Scanner;
/*
10. Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153
 */

//Armstrong number is a number that is equal to the sum of cubes of its digits.
public class ArmstrongNumber {
    //function to check if the number is Armstrong or not
    static boolean isArmstrong(int n) {
        int temp, digits = 0, last = 0, sum = 0;
        //assigning n into a temp variable
        temp = n;

        //loop execute until the condition becomes false
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        temp = n;
        while (temp > 0) {
            //determines the last digit from the number
            last = temp % 10;
            //calculates the power of a number up to digit times and add the resultant to the sum variable
            sum += (Math.pow(last, digits));

            //removes the last digit
            temp = temp / 10;
        }
        //compares the sum with n
        if (n == sum)
            //returns if sum and n are equal
            return true;
            //returns false if sum and n are not equal
        else return false;
    }


    public static void main(String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");

        //reads the input from the user
        num = sc.nextInt();
        sc.close();
        if (isArmstrong(num)) {
            System.out.print("Armstrong ");
        } else {
            System.out.print("Not Armstrong ");
        }
    }

}
