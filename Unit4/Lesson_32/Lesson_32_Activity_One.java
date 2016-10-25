/*
 * Lesson 32 Coding Activity 1
 * 
 * For the Lesson 32 activities, you will be asked to write one or more methods.
 * Use the template to write a main method that tests each of your methods, 
 * then paste everything into the code runner box. Your submission should 
 * begin with the first import statement and end with the final }.
 * 
 * Write a method that takes a parameter for the number of a month 
 * and prints the month's name. 
 * 
 * This method must be called monthName() and it must have an integer parameter. 
 * 
 * Calling monthName(8) should print August to the screen.
 */


import java.util.Scanner;

class Lesson_32_Activity_One {
  
     public static void monthName(int x){
        if (x == 1) {
            System.out.println("January");
        }
        else if (x == 2) {
            System.out.println("February");
        }
        else if (x == 3) {
            System.out.println("March");
        }
        else if (x == 4) {
            System.out.println("April");
        }
        else if (x == 5) {
            System.out.println("May");
        }
        else if (x == 6) {
            System.out.println("June");
        }
        else if (x == 7) {
            System.out.println("July");
        }
        else if (x == 8) {
            System.out.println("August");
        }
        else if (x == 9) {
            System.out.println("September");
        }
        else if (x == 10) {
            System.out.println("October");
        }
        else if (x == 11) {
            System.out.println("November");
        }
        else{
            System.out.println("December");
        }
     }
    
    public static void main(String[] args)
     {
        Scanner scan = new Scanner (System.in);
        int x = scan.nextInt();
     monthName(x);
    }
}