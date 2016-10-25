import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;

public class Student extends Person{
	int studentId=0;
	int level;

	public Student(String fName, String lName, int gLevel){
		super(fName, lName);

		if(gLevel<0 || gLevel>12){
			level = 0;
		}else{
			level = gLevel;
		}

		studentId=studentId++;
	}
	public int getLevel(){
		return level;
	}
	public String toString(){
		return ""+lastName+","+firstName+"\n"+"\t"+"Grade Level: "+level+"\n"+"ID #: "+studentId;
	}
}