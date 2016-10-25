/*
 * Lesson 22 Coding Activity 1
 * Write the code to take a String and print it with one letter per line.

  Sample run:

  Enter a string:
  bought
  b
  o
  u
  g
  h
  t
  
*/ 

import java.util.Scanner;
import java.lang.Math; 

class Lesson_22_Activity_One {
    public static void main(String[] args)
     {

      Scanner scan = new Scanner (System.in);
      System.out.println("Enter a string:");
      String string = scan.nextLine();
      System.out.println(string.charAt(0));
      System.out.println(string.charAt(1));
      System.out.println(string.charAt(2));
      System.out.println(string.charAt(3));
      System.out.println(string.charAt(4));
      System.out.println(string.charAt(5));

}
}