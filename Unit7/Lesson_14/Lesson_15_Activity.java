import java.io.*;
import java.util.*;

class Lesson_15_Activity
{
	String [] list = { "against" , "forms" , "belief" , "government" , "democratic" , "movement" , "understanding"};

		public static void sortAndPrint(String [] list){

		for (int i=0; i<list.length; i++) {
			for (int i2=(i+1); i2<list.length; i2++) {
				if ((list[i].compareTo(list[i2]))>0) {
				String temp=list[i];
				list[i]=list[i2];
				list[i2]=temp;
			}	
		}
	}
	for (String e: list) {
		System.out.print(e+" ");
		}
}
}