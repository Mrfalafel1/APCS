import java.io.*;
import static java.Lang.system.*;
import java.util.Scanner;
import java.Lang.Math;
import java.util.ArrayList;

class Lesson_1 {


    public static void main(String str[]) throws IOException
    {
      Scanner scan = new Scanner(System.in);
      String x = "";
      ArrayList list = new ArrayList();

      while(true){
        System.out.println("Please enter words, enter STOP to stop the loop.");
        x = scan.nextLine();
        if (x.equals("STOP")) {
          break;
        }else {
          list.add(x);
        }
      }

      System.out.println(list.size());
      System.out.println(list);
      if ((list.size())>2) {
        list.remove(list.size()-1);
        list.remove(0);
        System.out.println(list);
      }
    }
}