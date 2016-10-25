/*
 * AP CS MOOC
 * Term 2 - Assignment 3: School Classes
 * Use this runner to test your solutions to Assignment 3.
 */

import java.io.IOException;
import java.util.ArrayList;

public class student_runner_School
{

 public static void main(String arg[]) throws IOException
 {
  Person p = new Person("John", "Doe");
  System.out.println("printing person:\n");
  System.out.println(p);

  Student s = new Student("Sallie", "Smithers", 7);
  System.out.println("\n\nprinting student:\n");
  System.out.println(s);

  System.out.println("\n\nprinting highschoolstudent:\n");
  HighSchoolStudent h = new HighSchoolStudent("Bert", "Smith", 11, 3.67);
  System.out.println(h);

  ArrayList<Student> stu = new ArrayList<Student>();
  stu.add(new HighSchoolStudent("Jem", "Finch", 11, 3.4));
  stu.add(new Student("Scout", "Finch", 4));
  stu.add(new HighSchoolStudent("Natalie", "Adams", 11, 2.4));
  stu.add(new HighSchoolStudent("Boo", "Radley", 12, 1.7));
  stu.add(new HighSchoolStudent("Atticus", "Finch", 12, 4.8));
  stu.add(new Student("Elaine", "Benes", 9));
  stu.add(new Student("Patrick", "Henry", 11));

  ArrayList<Teacher> tea = new ArrayList<Teacher>();
  tea.add(new Teacher("Ada", "Lovelace", "Mathematics"));
  tea.add(new Teacher("Albert", "Einstein", "Physics"));                   
  tea.add(new Teacher("Grace", "Hopper", "Computer Science"));
  tea.add(new Teacher("Alan", "Turing", "Mathematics"));
  tea.add(new Teacher("Marie", "Curie", "Chemistry"));
  tea.add(new Teacher("Dolly", "Madison", "Government"));
  tea.add(new Teacher("Maya", "Angelou", "English Composition"));

  School sch = new School(stu, tea);
  System.out.println("\n\nprinting school: \n");
  System.out.println(sch);

  System.out.println("\n\njust seniors: \n" + sch.getGradeLevel(12));

 }
}