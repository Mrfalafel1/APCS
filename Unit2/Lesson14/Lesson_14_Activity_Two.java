/*
 * Lesson 14 Coding Activity 2
 * Write a program to input two integers and print 
 * "Both are positive or zero." to the screen, if both are positive or zero.
 * Print "One or both are negative." otherwise.
 */


import java.util.Scanner;

class Lesson_14_Activity_Two {
    public static void main(String[] args)
     {
     Scanner scan = new Scanner (System.in);
     
     int x = scan.nextInt();
     int y = scan.nextInt();
     
     if((x < 0) || (y < 0)){
       System.out.println("One or both are negative.");
     }else{
      System.out.println("Both are positive or zero."); 
     }
    }
}