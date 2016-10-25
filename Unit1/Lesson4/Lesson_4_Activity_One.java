/*
 * Lesson 4 Coding Activity Question 1
 * 
 * Input two doubles and print them backwards on the screen.
 *
 * So if the user enters:
 
 1.3 6.8
 
 * It should output:
 
 6.8 1.3
 
 * Notice there is exactly one space between the numbers.
*/

import java.util.Scanner;
import java.lang.Math;
import java.io.*;


class Lesson_4_Activity_One {
    public static void main(String[] args) throws IOException {
      
        Scanner scan = new Scanner (System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();

        System.out.println(y + " " + x);

    }
}