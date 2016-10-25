import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;

public class Student{

	private String firstName1 = "None";
	private String lastName1 = "None";
	private int gradeLevel1 = 0;
	private double gpa1 = 0.0;
	private static int id1 = 0;

	public Student(){
		this("None", "None", 0, 0.0);
	}
	public Student(String firstName, String lastName, int gradeLevel, double gpa){
		id1++;

		if (gradeLevel > 12 || gradeLevel < 0) {
			gradeLevel = 0;
		}
		if (gpa > 4.5 || gpa < 0.0) {
			gpa = 0.0;
		}

		lastName1 = lastName;
		firstName1 = firstName;
		gradeLevel1 = gradeLevel;
		gpa1 = gpa;
	}
	public String toString(){
		return ""+lastName1+", "+firstName1+"\n"+"GPA: "+gpa1+"\n"+"Grade Level: "+gradeLevel1+" id # "+id1;
	}
}