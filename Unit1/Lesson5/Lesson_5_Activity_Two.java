/*
 * Lesson 5 Coding Activity Question 2
 * 
 * Input four integer values and print the sum of all four values.
 *
*/

import java.util.Scanner;
import java.lang.Math;
import java.io.*;


class Lesson_5_Activity_Two {
    public static void main(String[] args) throws IOException {
      
      Scanner scan = new Scanner (System.in);
      int a = scan.nextInt();
      int b = scan.nextInt();
      int c = scan.nextInt();
      int d = scan.nextInt();

      System.out.println(a+b+c+d);

    }
}