/*
 * Lesson 3 Coding Activity Question 2
 * 
 * Write a program that asks the user for three names, then prints the names in reverse order.
 * 
 * Sample Run:

Please enter three names:
Zoey 
Zeb 
Zena 

Zena Zeb Zoey

*/

import java.util.Scanner;
import java.lang.Math;
import java.io.*;


class Lesson_3_Activity_Two {
    public static void main(String[] args) throws IOException {
      
        String a;
        String b;
        String c;
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Give me 3 names kid.");
        a = scan.nextLine();
        b = scan.nextLine();
        c = scan.nextLine();
        
        System.out.println(c);
        System.out.println(b);
        System.out.println(a);

    }
}