/*
 * AP CS MOOC
 * Term 2 - Assignment 1: Time
 * Use this runner program to test your Assignment 1 solution.
 */

import java.io.IOException;



class student_time_runner
{

 public static void main(String str[]) throws IOException
 {

  Time time1 = new Time(14, 56);
  System.out.println("time1: " + time1);
  System.out.println("convert time1 to standard time: " + time1.convert());
  System.out.println("time1: " + time1);
  System.out.print("increment time1 five times: ");
  time1.increment();
  time1.increment();
  time1.increment();
  time1.increment();
  time1.increment();
  System.out.println(time1 + "\n");

  Time time2 = new Time(-7, 12);
  System.out.println("time2: " + time2);
  System.out.print("increment time2 67 times: ");
  for (int i = 0; i < 67; i++)
   time2.increment();
  System.out.println(time2);
  System.out.println("convert to time2 standard time: " + time2.convert());
  System.out.println("time2: " + time2 + "\n");

  
  Time time3 = new Time(5, 17);
  System.out.println("time3: " + time3);
  System.out.print("convert time3: ");
  System.out.println(time3.convert());
  
  Time time4 = new Time(12, 15);
  System.out.println("\ntime4: " + time4);
  System.out.println("convert time4: " + time4.convert());

  Time time5 = new Time(0, 15);
  System.out.println("\ntime5: " + time5);
  System.out.println("convert time5: " + time5.convert());
  
  Time time6 = new Time(24, 15);
  System.out.println("\ntime6: " + time6);
  System.out.println("convert time6: " + time6.convert());
  
  Time time7 = new Time(23,59);
  System.out.println("\ntime7: " + time7);
  System.out.println("convert time7: " + time7.convert());
  time7.increment();
  System.out.println("increment time7: " + time7);
  System.out.println("convert time7: " + time7.convert());
  
 }

}

