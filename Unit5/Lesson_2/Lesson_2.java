import java.io.*;
import static java.Lang.system.*;
import static java.lang.Math;
import java.util.Scanner;
import java.util.ArrayList;

class Lesson_2 {


    public static void main(String str[]) throws IOException
    {
      Scanner scan = new Scanner(System.in);
      String x = "";
      ArrayList <String> list = new <String> ArrayList();

      while(true){
        System.out.println("Please enter words, enter STOP to stop the loop.");
        x = scan.nextLine();
        if (x.equals("STOP")) {
          break;
        }else {
          list.add(x);
        }
      }
      for (String a: list) {
      	if (a.indexOf('a')!=-1) {
      		System.out.println(a);
      	}
      }
    }
}