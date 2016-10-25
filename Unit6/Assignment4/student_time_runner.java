/*
 * AP CS MOOC
 * Term 2 - Assignment 4: Time Comparable
 * Use this runner file to test your Assignment 4 solution
 */

import java.io.IOException;
import java.util.Scanner;

class student_time_runner
{

	public static void main(String str[]) throws IOException
	{

		Scanner scan = new Scanner(System.in);

		// time 1
		Time t1 = new Time(17, 12);
		System.out.println(t1);

		Time t2 = new Time(9, 45);
		System.out.println(t2);
		System.out.println("Greater Than:");
		System.out.println(t1.compareTo(t2));
		System.out.println("Less Than:");
		System.out.println(t2.compareTo(t1));
		System.out.println("Times equal:");
		Time t3 = new Time(9, 45);
		System.out.println(t3.compareTo(t2));
		System.out.println("Hours equal:");
		Time t4 = new Time(8, 45);
		Time t5 = new Time(8, 34);
		System.out.println(t4.compareTo(t5));
		System.out.println(t5.compareTo(t4));
		System.out.println("Difference");
		System.out.println(t4.difference(t5));
		System.out.println(t5.difference(t4));
		System.out.println(t4.difference(t4));
	}// main

}// class

