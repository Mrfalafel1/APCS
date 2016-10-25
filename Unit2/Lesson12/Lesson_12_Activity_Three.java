/*
 * Lesson 12 Coding Activity 3 
 * Input two decimal numbers and print the largest.
 * If the numbers are equal, print one of them.
 *     
 *     Sample Run 1
 *         Enter a test score:
 *         78.5
 *         Valid
 *
 *         
 *      Sample Run 2
 *         Enter a test score:
 *         179
 *         Not Valid         
 * 
 */


import java.util.Scanner;

class Lesson_12_Activity_Three {
    public static void main(String[] args)
     {
     Scanner scan = new Scanner (System.in);
     
     System.out.println("Enter a test score:");
     double x = scan.nextDouble();
     if((x <= 100) && (x >= 1)){
       System.out.println("Valid");
     }
     else
     {
      System.out.println("Not Valid"); 
     }
    }
}