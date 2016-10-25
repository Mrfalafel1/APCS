/*
 * Lesson 1011 Coding Activity 
 * 
 * Input a String to represent the octal number and translate to the base ten number. 
 * The octal number must be 8 digits or less. 
 * 
 * Your program should also check that all the digits are 0 - 7, then translate the 
 * number to base ten. 
 * 
 * Sample Run 1: 
 * Enter a number in base 8: 
 * 1287 
 * ERROR: Incorrect Octal Format 
 * 
 * Sample Run 2: 
 * Enter a number in base 8: 
 * 123 
 * 83 
 * 
 * Sample Run 3: 
 * Enter a number in base 8: 
 * 1111111111 
 * ERROR: Incorrect Octal Format
 *   
 */ 

import java.util.Scanner;
import java.lang.Math;
import java.*;

class Lesson_1011_Activity{
    public static void main(String[] args)
     {
     	Scanner scan = new Scanner (System.in);

     	System.out.println("Enter a number in base 8:");
     	int x = scan.nextInt();
     	int ten = 0;
     	int power = 0;
     	String x2 = Integer.toString(x);
     	boolean too_high = false;

     	if (x2.length()>8) {
     		System.out.println("ERROR: Incorrect Octal Format");
     	}
     	else{
     		while((x%10)>0){
     			if((x%10)>7){
     				too_high = true;
     				x = (x/10);
     			}else{
     			ten = (int)(((x%10)*Math.pow(8, power))+ten);
     				power++;
     				x = (x/10);
     			}
     		}
     		if(too_high == true){
     			System.out.println("ERROR: Incorrect Octal Format");
     		}
     		else{
     			System.out.println(ten);
     		}
     	}
     } 	
}