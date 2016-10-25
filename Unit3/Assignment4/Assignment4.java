import java.util.Scanner;
import java.lang.Math;
import java.io.*;

class Assignment4 {
    public static void main(String[] args){

      int hashtags = 0;
      int attributions = 0;
      int links = 0;
      int h = 0;
      int a = 0;
      int l = 0;

      Scanner scan = new Scanner (System.in);

      System.out.println("Please enter a tweet:");
      String tweet = scan.nextLine();
      String tweetLower = tweet.toLowerCase();
      if(tweet.length() > 140){
        System.out.println("Excess Characters: " + (tweet.length() - 140));
      }else{

        /* Quan says hi */

        System.out.println("Length Correct");

        for (h = 0; h < tweet.length(); h++) {
          if (h + 2 < tweet.length()) {
        if((tweet.charAt(h) == '#') && ((tweet.charAt(h+1) != ' ') && (tweet.charAt(h+1) != '\t'))){
          hashtags++;
        }
      }
    }
        for (a = 0; a < tweet.length(); a++) {
          if(a + 2 < tweet.length()){
        if((tweet.charAt(a) == '@') && ((tweet.charAt(a+1) != ' ') && (tweet.charAt(a+1) != '\t'))){
          attributions++;        
        }
      }
    }
        for (l = 0; l < tweetLower.length(); l++) {
        if(tweetLower.charAt(l) == 'h'){
          if(tweetLower.charAt(l+1) == 't'){
            if(tweetLower.charAt(l+2) == 't'){
              if(tweetLower.charAt(l+3) == 'p'){
                if(tweetLower.charAt(l+4) == ':'){
                  if(tweetLower.charAt(l+5) == '/'){
                    if(tweetLower.charAt(l+6) == '/'){
                      links++;
                    }
                  }
                }
              }
            }
          }
        }
      }
    }

        System.out.println("Number of Hashtags: " + hashtags);
        System.out.println("Number of Attributions: " + attributions);
        System.out.println("Number of Links: " + links);
      }
    }