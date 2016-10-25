import java.util.Scanner;
import java.lang.Math;
import java.io.*;


class Assignment_2 {
    public static void main(String[] args) throws IOException {
      
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Please Enter the Cost of the Item:");
        double i = scan.nextDouble();
        System.out.println("Please Enter the Amount Paid:");
        double p = scan.nextDouble();
        
        double cr = (int)((p*100)-(i*100));
        cr = (cr/100);
        double c0 = ((p*100)-(i*100));
        int q = (int)(c0/25);
        double c1 = (c0-q*25);
        int d = (int)((c1/10));
        double c2 = (c1-d*10);
        int n = (int)(c2/5);
        double c3 = (c2-n*5);
        int pe = (int)(c3/1);
        
        System.out.println("Change Owed: " + cr);
        System.out.println("Quarters: " + q);
        System.out.println("Dimes: " + d);
        System.out.println("Nickels: " + n);
        System.out.println("Pennies: " + pe);
    }
}