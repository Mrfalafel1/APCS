import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;

public class Vehicle{

	private int location = 0;

	public Vehicle(){
		this(0);
	}
	public Vehicle(int loc){
		if ((loc >= -20) && (loc <= 20)) {
			location = loc;
		}
	}
	public void forward(){
		if ((location) < 20) {
			location++;
		}
	}
	public void backward(){
		if ((location) > -20) {
			location--;
		}
	}
	public int getLocation(){
		return location;
	}
	public String toString(){
		String stringspot = "";

		for (int i = -20; i<location; i++) {
			stringspot = stringspot + " ";
		}
		stringspot = stringspot + "@";
		return stringspot;
	}
}