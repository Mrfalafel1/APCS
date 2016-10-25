/*
 * Lesson 12 Coding Activity 1 
 * Write a program to input three integers. 
 * Test if the average is greater than or equal to 89.5. 
 * If so, print out the phrase "ABOVE AVERAGE" (without the quotes).
 */


import java.util.Scanner;

class Lesson_12_Activity_One {
    public static void main(String[] args)
     {
     Scanner scan = new Scanner (System.in);
     
     int x = scan.nextInt();
     int y = scan.nextInt();
     int z = scan.nextInt();
     
     double a = (((double)x+(double)y+(double)z)/3);
     
     if(a >= 89.5){
       System.out.println("ABOVE AVERAGE");
     }
    }
}