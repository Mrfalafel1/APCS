/*
 * Lesson 3 Coding Activity Question 3
 * 
 * Write a program that will ask the user to enter an adjective and a name. 
 * Print the following sentence, replacing the ______ with the words they entered.
 * 
 * My name is _____. I am _____.
 *
 * Sample Run:

Hi there. What is your name?
Ada
What adjective describes you?
logical
My name is Ada. I am logical.

*/

import java.util.Scanner;
import java.lang.Math;
import java.io.*;


class Lesson_3_Activity_Three {
    public static void main(String[] args) throws IOException {
      
        String n;
        String a;
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Hi there. What is your name?");
        n = scan.nextLine();
        System.out.println("What adjective describes you?");
        a = scan.nextLine();
        
        System.out.println("My name is " + n + ". I am " + a + ".");

    }
}