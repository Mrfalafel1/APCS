/*
 * Lesson 22 Coding Activity 2
 * Write the code to take a String and print it diagonally.

  Sample run:

  Enter a string:
  bought
  b
      o
          u
              g
                  h
                      t
  Use a tab character for every four spaces in the sample.

  Hint: You may need more than one loop.
  
*/ 

import java.util.Scanner;
import java.lang.Math; 

class Lesson_22_Activity_Two {
    public static void main(String[] args)
     {
      Scanner scan = new Scanner (System.in);
      System.out.println("Enter a string:");
      String string = scan.nextLine();
      System.out.println(string.charAt(0));
      System.out.println("\t" + string.charAt(1));
      System.out.println("\t\t" + string.charAt(2));
      System.out.println("\t\t\t" + string.charAt(3));
      System.out.println("\t\t\t\t" + string.charAt(4));
      System.out.println("\t\t\t\t\t" + string.charAt(5));
}
}