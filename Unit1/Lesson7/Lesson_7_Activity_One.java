/*
 * Lesson 7 Coding Activity Question 1
 *
 * Input a positive three digit integer. Print out the digits one per line.
 *
 * Sample run:
 
Please enter a three digit number:
678

Here are the digits:
6
7
8

*/

import java.util.Scanner;
import java.lang.Math;
import java.io.*;


class Lesson_7_Activity_One {
    public static void main(String[] args) throws IOException {
      
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Please enter a three digit number:");
        int x = scan.nextInt();
        int y = (x % 10);
        int z = ((x/10) % 10);
        int a = ((x/100) % 10);
        System.out.println("Here are the digits:");
        System.out.println(a);
        System.out.println(z);
        System.out.println(y);

    }
}