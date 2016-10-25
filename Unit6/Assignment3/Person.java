import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;

public class Person{
	String firstName;
	String lastName;

	public Person(String fName, String lName){
		firstName=fName;
		lastName=lName;
	}
	public String toString(){
		return ""+lastName+","+firstName;
	}
}