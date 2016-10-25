/*
 * Lesson 13 Coding Activity 1 
 * Take input of an integer number from the keyboard 
 * and print "Positive" if it's positive or zero, and print "Negative" otherwise.
 */


import java.util.Scanner;

class Lesson_13_Activity_One {
    public static void main(String[] args)
     {
     Scanner scan = new Scanner (System.in);
     
     int x = scan.nextInt();
     if(x >= 0){
       System.out.println("Positive");
     }else if (x < 0){
      System.out.println("Negative"); 
     }
}
}