/*
 * AP CS MOOC
 * Term 2 - Assignment 4: Time Comparable
 * You can use this solution to Assignment 1 in order to create a comparable time object.
 * You will need to change the class so that it implements the comparable interface.
 */

public class Time implements Comparable<Time>
{
     private int hour;
     private int minute;
    
    /*
     * Sets the default time to 12:00.
     */
    public Time ()
    {
         this(12, 0);
    }
    
    /*
     * Sets hour to h and minute to m.
     */
    public Time (int h, int m)
    {
         hour = 0;
         minute = 0;
         if (h >=1 && h <= 23)
              hour = h;
         if (m >= 1 && m <= 59)
              minute = m;
            
    }
    
    /*
     * Returns the time as a String of length 4 in the format: 0819.
     */
     public String toString ()
     {
          
          String h = "";
          String m = "";
          if ( hour <10)
               h +="0";
          if (minute <10)
               m +="0";
          h += hour;
          m+=minute;
          
          return "" + h + "" + m;
     }

     public int compareTo(Time other){
      if (hour<other.getHour() || ((hour==other.getHour()) && minute<other.getMinute())) {
        return -1;
      }
      else if (hour==other.getHour() && minute==other.getMinute()) {
        return 0;
      }
      else{
        return 1;
      }
     }

     public String difference(Time t){
      int t1;
      int t2;
      String absolutefinaltotalminutes;
      if (compareTo(t) == 1) {
        t1=(hour*60)+minutes;
        t2=(t.getHour()*60)+t.getMinute;
        int t3=t1-t2;
          
        }
        return
      }
      else if (compareTo(t) == -1) {
        return ""+(t.getHour()-hour)+":"+(t.getMinute()-minute);
      }
      else{
        return "00:00";
      }
     }

     public int getHour(){
      return hour;
     }
     public int getMinute(){
      return minute;
     }
}