/*
 * Lesson 5 Coding Activity Question 1
 * 
 * Input two double values and print the difference between them. 
 * (The difference can be found by subtracting the second value from the first).
 *
*/

import java.util.Scanner;
import java.lang.Math;
import java.io.*;


class Lesson_5_Activity_One {
    public static void main(String[] args) throws IOException {
      
        Scanner scan = new Scanner (System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        
        System.out.println(x-y);


    }
}