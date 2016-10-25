/*
 * Lesson 11 Coding Activity 1
 * Test if an integer input from the keyboard is equal to the integer 176. 
 * If it is, print "YES" (without the quotes).
*/

import java.util.Scanner;
import java.lang.Math;


class Lesson_11_Activity_One {
   
      
      
public static void main(String[] args) 
   { 
   Scanner scan = new Scanner (System.in);
   
   int x = scan.nextInt();
   if(x==176){
     System.out.println("YES");
   }
}
}