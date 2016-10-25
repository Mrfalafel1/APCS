import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;

public class Time{

	private int hour = 0;
	private int minutes = 0;

	public Time(){
		this(12,0);
	}
	public Time(int h, int m){
		if((h<=23) && (h>=1)){
			hour=h;
		}else{
			hour=0;
		}

		if((m<=59) && (m>=0)){
			minutes=m;
		}else{
			minutes=0;
		}
	}
	public String toString(){
		if (hour<10 && minutes<10) {
			return ""+0+hour+0+minutes;
		}
		else if (hour>=10 && minutes<10) {
			return ""+hour+0+minutes;
		}
		else if (hour<10 && minutes>=10) {
			return ""+0+hour+minutes;
		}
		else {
			return ""+hour+minutes;
		}
	}
	public String convert(){
		if (hour>11 && minutes>=10 && hour!=12) {
			return ""+(hour-12)+':'+minutes+" "+"pm";
		}
		else if (hour>11 && minutes<10 && hour!=12){
			return ""+(hour-12)+':'+0+minutes+" "+"pm";
		}
		else if (hour==0 && minutes<10){
			return ""+12+':'+0+minutes+" "+"am";
		}
		else if (hour==0 && minutes>=10){
			return ""+12+':'+minutes+" "+"am";
		}
		else if (hour==12 && minutes<10){
			return ""+12+':'+0+minutes+" "+"pm";
		}
		else if (hour==12 && minutes>=10){
			return ""+12+':'+minutes+" "+"pm";
		}
		else if (hour<11 && minutes>=10 && hour!=0){
			return ""+hour+':'+minutes+" "+"am";
		}
		else {
			return ""+hour+':'+0+minutes+" "+"am";
		}
	}
	public void increment(){
		minutes++;

		if (minutes>59) {
			minutes=0;
			hour++;
		}
		if (hour>23) {
			hour=0;
			minutes=0;
		}
	}
}