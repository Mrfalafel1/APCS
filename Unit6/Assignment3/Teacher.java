import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;

public class Teacher extends Person{
	String subject;

	public Teacher(String fName, String lName, String subject){
		super(fName, lName);
	}
	public String toString(){
		return ""+lastName+","+firstName+"\n"+"\t"+"Subject: "+subject;
	}
}