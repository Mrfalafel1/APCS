import java.util.Scanner;
import java.lang.Math;
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException {
      
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Please enter your test grades.");
        int t1 = scan.nextInt();
        int t2 = scan.nextInt();
        double ta = ((double)(((double)(t1+t2)/2)));
        
        System.out.println("Please enter your quiz grades.");
        int q1 = scan.nextInt();
        int q2 = scan.nextInt();
        int q3 = scan.nextInt();
        double qa = ((double)((double)(q1+q2+q3)/3));

        System.out.println("Please enter your homework average.");
        double ha = scan.nextDouble();
        
        System.out.println("Test Average: " + ((double)((t1+t2))/2));
        System.out.println("Quiz Average: " + ((double)((q1+q2+q3))/3));
        System.out.println("Final Grade: " + ((double)((ta*.5)+(qa*.3)+(ha*.2))));
        //System.out.println("Final Grade: " + ((double)((((t1+t2)/2)*.5)+(((q1+q2+q3)/3)*.3)+((ha)*.2))));
    }
}