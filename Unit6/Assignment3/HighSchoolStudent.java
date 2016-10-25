import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;

public class HighSchoolStudent extends Student{
	double gpa;

	public HighSchoolStudent(String fName, String lName, int gLevel, double gpa){
		super(fName, lName, gLevel);

		if (gpa<0 || gpa>5) {
			gpa=0;
		}else{
			gpa=gpa;
		}
	}
	public String toString(){
		return ""+lastName+","+firstName+"\n"+"\t"+"Grade Level: "+level+"\n"+"ID #: "+studentId+"\n"+"GPA: "+gpa;
	}
}