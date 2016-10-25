/*
 * Lesson 34 Coding Activity 4
 * 
 * For the Lesson 34 activities, you will be asked to write one or more methods.
 * Use the template to write a main method that tests each of your methods, 
 * then paste everything into the code runner box. Your submission should 
 * begin with the first import statement and end with the final }.
 *  
 * Write a method that takes an array of ints 
 * and returns the smallest value in the array.
 * 
 *     public static int findMin(int [] a)
 * 
 */


import java.util.Scanner;

class Lesson_34_Activity_Four {
  
   public static int findMin(int [] a)
    {
    int max = 1000000;
    for (int i=0; i<a.length; i++) {
      if (a[i] < max) {
        max = a[i];
      }
    }
     return max; 
    }
  
    public static void main(String[] args)
     {
     int[] a = {1,2,3};
     findMin(a);
    }
}