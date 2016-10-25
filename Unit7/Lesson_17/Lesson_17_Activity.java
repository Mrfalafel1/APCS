/*
 * Amplify AP CS MOOC - Term 2, Lesson 14 
 * Rebecca Dovi 
 */
import java.io.*;
import java.util.*;

class Lesson_17_Activity
{
	public static boolean isSorted(int [] a){
		boolean sorted=true;

		for (int i=1; i<a.length; i++) {
			if (a[i]<a[i-1]) {
				sorted=false;
			}
			else{
			sorted=false;
		}
		}
		

		return sorted;
	}

	public static int binarySearch(int [] a, int b){
		int found = -1;
		for (int i=0; i<a.length; i++) {
			if (a[i]==b) {
				found=i;
			}
		}
		return found;
}
}
