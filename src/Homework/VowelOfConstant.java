package Homework;

import java.util.Scanner;
/*3. Write a Java program that takes the user to provide a single character from the   alphabet. Print Vowel of Consonant, depending on the user input. If the user input   Is not a letter (between a and z or A and Z), or is a string of length > 1, print an  error message.
        For eg:
        Input an alphabet: p
        Expected Output:
        Input letter is Consonant*/

public class VowelOfConstant {

    public static void main(String[] args) {
        vowelOrConstant();
    }

    public static void vowelOrConstant() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the alphabet");
        String letter = scan.next().toLowerCase();
        // if condition to check if input entry is single letter
        if (letter.length() > 1) {
            System.out.println("Not a single charater");
            //if user has enter letter or symbol or digit
        } else if (!isItALetter(letter)) {
            System.out.println("Not a letter, please enter alphabet");
        } else if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {
            System.out.println("Letter is vowel");
        } else {
            System.out.println("Letter is constant");
        }

    }

    //method return true if letter is alphabet
    public static boolean isItALetter(String l) {
        if (l.charAt(0) > 96 && l.charAt(0) < (123)) {
            return true;
        }
        return false;
    }
}


