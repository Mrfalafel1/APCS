/*
 * Lesson 3 Coding Activity Question 1
 * 
 * Write the code to ask the user to enter their name and print the following message:

Hi ______, nice to see you.
 
 * Remember, you'll need to use the method println and Scanner class method nextLine.
*/

import java.util.Scanner;
import java.lang.Math;
import java.io.*;


class Lesson_3_Activity_One {
    public static void main(String[] args) throws IOException {
      
       Scanner scan = new Scanner (System.in);
        System.out.println("What is your name?");
        String n;
        n = scan.nextLine();
        System.out.println("Hi " + n + ", nice to see you.");


    }
}