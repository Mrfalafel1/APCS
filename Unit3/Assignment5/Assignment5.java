import java.util.Scanner;
import java.lang.Math;
import java.io.*;

class Assignment5 {
    public static void main(String[] args){
      Scanner scan = new Scanner(System.in);

      System.out.println("Enter the first String:");
      String x = scan.nextLine();
      System.out.println("Enter the replacement String:");
      String y = scan.nextLine();

      boolean wildcard = false;

      for (int i=0;i < x.length(); i++) {
        char e = x.charAt(i);
        if ((e != '*') && (Character.toUpperCase(e) == Character.toLowerCase(e))) {
         System.out.println("Error: Incorrect characters");
        }
        if(x.charAt(i)=='*'){
          System.out.println(x.substring(0, i) + y + x.substring(i+1, x.length()));
          wildcard = true;
        }
      }
      if (wildcard == false) {
        System.out.println("Error: no *");
      }
  }
}