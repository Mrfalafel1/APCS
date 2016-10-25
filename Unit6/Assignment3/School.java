import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;

public class School{
	ArrayList<Student> students = new ArrayList<Student>();
	ArrayList<Teacher> teachers = new ArrayList<Teacher>();

	public School(ArrayList<Student> uStudents, ArrayList<Teacher> uTeachers){
		students=uStudents;
		teachers=uSeachers;
	}
	public String getGradeLevel(int level){
		String meme;

		for(Student eStudent: students){
			if (eStudent.getLevel()==level) {
				meme += eStudent.toString()+"\n";
			}
		}
		return meme;
	}
	public String toString(){
		String meme;

		meme += "Faculty:\n";
		for(Teacher eTeacher: teachers){
			meme += eTeacher.toString()+"\n";
		}

		meme += "Student Body:\n";
		for(Student eStudent: students){
			meme += eStudent.toString()+"\n";
		}

		return meme;
	}
}