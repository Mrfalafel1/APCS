/*
 * Lesson 13 Coding Activity 3 
 * Input two integers and print the largest. If they are equal print "EQUAL". 
 * You should be able to do this with only one if statement but you may use multiple else statements.
 */


import java.util.Scanner;

class Lesson_13_Activity_Three {
    public static void main(String[] args)
     {
     Scanner scan = new Scanner (System.in);
     
     int x = scan.nextInt();
     int y = scan.nextInt();
     
     if(x > y){
      System.out.println(x); 
     }else if(y > x){
      System.out.println(y); 
     }else if(y==x){
       System.out.println("EQUAL");
     }
    }
}