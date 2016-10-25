/*
 * Lesson 6 Coding Activity Question 3
 *
 * Input a double and print the first two digits after the decimal point.
 *
 * Sample run:
 
Please input a decimal number:
57.8934
Answer: 89

 * Hint - you will need to do a numeric cast and some division and/or subtraction.
 *
*/

import java.util.Scanner;
import java.lang.Math;
import java.io.*;


class Lesson_6_Activity_Three {
    public static void main(String[] args) throws IOException {
      
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Please input a decimal number;");
        double x = scan.nextDouble();
        int y = ((int)(x*100));
        int z = ((int)(x));
        System.out.println("Answer: " + (y-(z*100)));

    }
}