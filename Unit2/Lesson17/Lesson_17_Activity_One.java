/*
 * Lesson 17 Coding Activity 1
 * Write a program that will input a list of test scores in from the keyboard.
 * When the user enters -1, print the average.
 *
 * What do you need to be careful about when using -1 to stop a loop?
 *
 *     Sample Run:
 *         Enter the Scores:
 *         45
 *         100
 *         -1
 *
 *         The average is: 72.5
 *
 *
 */

import java.util.Scanner;
import java.lang.Math;

class Lesson_17_Activity_One {
    public static void main(String[] args)
     {
      double x = 0;
      double y = 0;
      double z = -1;
      Scanner scan = new Scanner (System.in);

      System.out.println("Enter the Scores:");
      while(x != -1){
        y = y + x;
        z++;
        x = scan.nextDouble();
      }
      System.out.println("The average is: " + (y/z));
    }
}
