import java.util.Scanner;
import java.lang.Math;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
      
      String m;
      String d;
      String s;
      
      Scanner scan = new Scanner (System.in);
      System.out.println("What month were you born in?(number)");
      int month = scan.nextInt();
      System.out.println("What day (number)");
      int day = scan.nextInt();
      
      if(((month > 12) || (month < 1)) || ((day > 31) || (day < 1))){
        System.out.println("error");
      }
      
      if(month == 1){
        m = "January";
      }
      else if(month == 2){
        m = "February";
      }
      else if(month == 3){
        m = "March";
      }
      else if(month == 4){
        m = "April";
      }
      else if(month == 5){
        m = "May";
      }
      else if(month == 6){
        m = "June";
      }
      else if(month == 7){
        m = "July";
      }
      else if(month == 8){
        m = "August";
      }
      else if(month == 9){
        m = "September";
      }
      else if(month == 10){
        m = "October";
      }
      else if(month == 11){
        m = "November";
      }
      else{
        m = "December";
      }
      
      if(day == 1){
       d = "first";
      }
      else if(day == 2){
        d = "second";
      }
      else if(day == 3){
        d = "third";
      }
      else if(day == 4){
        d = "fourth";
      }
      else if(day == 5){
        d = "fifth";
      }
      else if(day == 6){
        d = "sixth";
      }
      else if(day == 7){
        d = "seventh";
      }
      else if(day == 8){
        d = "eighth";
      }
      else if(day == 9){
        d = "ninth";
      }
      else if(day == 10){
        d = "tenth";
      }
      else if(day == 11){
        d = "eleventh"; 
      }
      else if(day == 12){
        d = "twelfth";
      }
      else if(day == 13){
        d = "thirteenth";
      }
      else if(day == 14){
        d = "fourtheenth";
      }
      else if(day == 15){
        d = "fifteenth";
      }
      else if(day == 16){
        d = "sixteenth";
      }
      else if(day == 17){
        d = "seventeenth";
      }
      else if(day == 18){
        d = "eighteenth";
      }
      else if(day == 19){
        d = "nineteenth";
      }
      else if(day == 20){
        d = "twentieth";
      }
      else if(day == 21){
        d = "twenty-first";
      }
      else if(day == 22){
        d = "twenty-second";
      }
      else if(day == 23){
        d = "twenty-third";
      }
      else if(day == 24){
        d = "twenty-fourth";
      }
      else if(day == 25){
        d = "twenty-fifth";
      }
      else if(day == 26){
        d = "twenty-sixth";
      }
      else if(day == 27){
        d = "twenty-seventh";
      }
      else if(day == 28){
        d = "twenty-eighth";
      }
      else if(day == 29){
        d = "twenty-ninth";
      }
      else if(day == 30){
        d = "thirtieth";
      }
      else{
       d = "thirty-first";
      }
      
      if(((month == 3) && ((day >= 21) || (day <=31))) || ((month == 4) && ((day >= 1) && (day <= 19)))){
        s = "Aries";
      }
      else if(((month == 4) && ((day >= 20) || (day <=31))) || ((month == 5) && ((day >= 1) && (day <= 20)))){
        s = "Taurus";
      }
      else if(((month == 5) && ((day >= 21) || (day <=31))) || ((month == 6) && ((day >= 1) && (day <= 20)))){
        s = "Gemini";
      }
      else if(((month == 6) && ((day >= 21) || (day <=31))) || ((month == 7) && ((day >= 1) && (day <= 22)))){
        s = "Cancer";
      }
      else if(((month == 7) && ((day >= 23) || (day <=31))) || ((month == 8) && ((day >= 1) && (day <= 22)))){
        s = "Leo";
      }
      else if(((month == 8) && ((day >= 23) || (day <=31))) || ((month == 9) && ((day >= 1) && (day <= 22)))){
        s = "Virgo";
      }
      else if(((month == 9) && ((day >= 23) || (day <=31))) || ((month == 10) && ((day >= 1) && (day <= 22)))){
        s = "Libra";
      }
      else if(((month == 10) && ((day >= 23) || (day <=31))) || ((month == 11) && ((day >= 1) && (day <= 21)))){
        s = "Scorpio";
      }
      else if(((month == 11) && ((day >= 22) || (day <=31))) || ((month == 12) && ((day >= 1) && (day <= 21)))){
        s = "Sagittarius";
      }
      else if(((month == 12) && ((day >= 22) || (day <=31))) || ((month == 1) && ((day >= 1) && (day <= 19)))){
        s = "Capricorn";
      }
      else if(((month == 1) && ((day >= 20) || (day <=31))) || ((month == 2) && ((day >= 1) && (day <= 18)))){
        s = "Aquarius";
      }
      else{
        s = "Pisces";
      }
      
      System.out.println("Your birthday is: " + m + " " + d + " " + s);
    }
}