import java.util.Scanner;
import java.lang.Math;
import java.io.*;

class Assignment7 {

    public static int[] convertToBinary(int a){
        int [] binary = new int[8]; 
        int index = 0;
        while(a > 0){
            binary[index++] = a%2;
            a = a/2;
        }
        return binary;
    }

    public static void printBin(int b[]){
        for (int i = 7; i>=0; i--) {
            System.out.print(b[i] + " ");
        }
    }

    /**public static int[] addBin(int a[], int b[]){
        int [] addedBinary = new int[8];
        for (int i = 0; i<a.length-1; i++) {
            if (a[i] == 0 && b[i] == 0) {
                addedBinary[i] = 0;
            }
            else if (a[i] == 1 && b[i] == 0) {
                addedBinary[i] = 1;
            }
            else if (a[i] == 0 && b[i] == 1) {
                
            }
            else{
                addedBinary[i] = 1;
                addedBinary[i+1] = 1;
            }
        }
        return addedBinary;
    }*/

    public static int[] addBin(int a[], int b[]){
        int [] addedBinary = new int[9];
        int index = 0;
        while(a[0] > 0){
            addedBinary[index++] = a[0]%2;
            a[0] = a[0]/2;
        }
        return addedBinary;
    }


    public static void main(String[] args){
    Scanner scan = new Scanner (System.in);

    int z = 0;
    int p = 0;
    boolean error = false;

    System.out.println("Enter a base ten number between 0 and 255, inclusive.");
    int inputA = scan.nextInt();
    System.out.println("Enter a base ten number between 0 and 255, inclusive.");
    int inputB = scan.nextInt();

    int a[] = {inputA+inputB};

    int[] arrayA = convertToBinary(inputA);
    int[] arrayB = convertToBinary(inputB);
    int[] arrayC = addBin(a, arrayB);
    
    
    System.out.println("\n");
    System.out.println("First binary number:");
    printBin(arrayA);
    System.out.println("\n");
    System.out.println("Second binary number:");
    printBin(arrayB);
    System.out.println("\n");
    System.out.println("Added:");

    /**if ((inputA+inputB)>255) {
        z = 8;

    }
    else if((inputA+inputB)<=255){
        z = 7;
        p = -1;
        }
    for (int i = z; i>p; i--) {
        System.out.print(arrayC[i] + " ");
    }*/

    if ((inputA+inputB)>255) {
        z = 7;
        error = true;
    }
    else if((inputA+inputB)<=255){
        z = 7;
        }

    if (error == true) {
        System.out.println("Error: overflow");
    }
    for (int i = z; i>=p; i--) {
        System.out.print(arrayC[i] + " ");
    }
  }    
}