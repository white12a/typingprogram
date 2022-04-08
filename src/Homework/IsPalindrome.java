package Homework;

public class IsPalindrome {

    public static void main(String[] args) {
        isPalindrome(-1221);
        isPalindrome(707);
        isPalindrome(11212);
    }

    public static boolean isPalindrome(int number) {
        int a = number;
        int reverse = 0;

        //while number is not equal to 0;
        while (number != 0) {
            int lastDigit = number % 10;// storing the  last digit---1
            reverse = reverse * 10;// increasing the place value of reverse by 1---
            reverse = reverse + lastDigit;//adding last digit to reverse
            number = number / 10; //removing the last digit of number
        }
        if (a == reverse) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

}
