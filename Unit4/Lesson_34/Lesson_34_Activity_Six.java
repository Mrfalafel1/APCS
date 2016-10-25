/*
 * Lesson 34 Coding Activity 6
 * 
 * For the Lesson 34 activities, you will be asked to write one or more methods.
 * Use the template to write a main method that tests each of your methods, 
 * then paste everything into the code runner box. Your submission should 
 * begin with the first import statement and end with the final }.
 * 
 * Write a method that takes an array of ints and returns true if all 
 * of the values in the array are positive. If the array contains any
 * negative integers, it should return false.
 * 
 *     public static boolean allPositive(int [] a)
 * 
 */


import java.util.Scanner;

class Lesson_34_Activity_Six {
  
  public static boolean allPositive(int [] a)
    {
    boolean negative = true;
    for (int i=0; i<a.length; i++) {
      if (a[i]<0) {
        negative = false;
      }
    }
     return negative;
    }
  
    public static void main(String[] args)
     {
     int[] a = {1,2,3};
     allPositive(a);
    }
}