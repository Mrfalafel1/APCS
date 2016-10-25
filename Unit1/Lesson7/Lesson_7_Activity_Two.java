/*
 * Lesson 7 Coding Activity Question 2
 *
 * Change the last problem so that it also prints the sum of the digits. 
 * Use the format shown below.
 *
 * Make sure your output is printed in the same order as the sample run.
 *
 * Sample run:
 
Please enter a three digit number:
678

Here are the digits:
6
7
8

6 + 7 + 8 = 21

*/

import java.util.Scanner;
import java.lang.Math;
import java.io.*;


class Lesson_7_Activity_Two {
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
        System.out.println(a + " + " + z + " + " + y + " = " + (a+z+y));


    }
}