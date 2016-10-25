import java.util.Scanner;
import java.lang.Math;
import java.io.*;

class Assignment6 {
    public static void main(String[] args){
    Scanner scan = new Scanner (System.in);

    int [] a = new int [10000];
    int [] b = new int [10000];
    
    int aNum = 0;
    int bNum = 0;
    int flag = 0;
    int x = 0, y = 0, z = 0;

    System.out.println("Enter the values for the first array, up to 10000 values, enter a negative number to quit");
      for (int i = 0; i < a.length; i++) {
        int aInput = scan.nextInt();
        if(aInput < 0){
          break;
        }else {
          a[i] = aInput;
          aNum++;
        }
      }
    System.out.println("Enter the values for the second array, up to 10000 values, enter a negative number to quit");
    for (int i = 0; i < b.length; i++) {
        int bInput = scan.nextInt();
        if(bInput < 0){
          break;
        }else {
          b[i] = bInput;
          bNum++;
        }
      }

      for (int i = 0; i < aNum; i++) {
       if ((i > 1) && (a[i] < a[i-1])) {
          flag = 1;
        } 
      }
      for (int i = 0; i < bNum; i++) {
       if ((i > 1) && (b[i] < b[i-1])) {
          flag = 1;
        } 
      }

          System.out.println("First Array:");
        for (int i = 0; i < aNum; i++) {
          System.out.print(a[i] + " ");
        }
        System.out.println("\nSecond Array:");
        for (int i = 0; i < bNum; i++) {
          System.out.print(b[i] + " ");
        }

        if (flag == 0) {
        System.out.println("\nMerged Array:");
        int [] d = new int [aNum + bNum];
        while (x < aNum && y < bNum)
        {
        if (a[x] < b[y])
        {
            d[z] = a[x];
            x++;
        }
        else
        {
            d[z] = b[y];
            y++;
        }
        z++;
        }

        while (x < aNum)
        {
            d[z] = a[x];
            x++;
            z++;
        }

        while (y < bNum)
        {
            d[z] = b[y];
            y++;
            z++;
        }
        for (int i = 0; i < d.length; i++) {
              System.out.print(d[i] + " ");
            }
          }

      if (flag == 1) {
        System.out.println("ERROR: Array not in correct order");
      }
  }    
}