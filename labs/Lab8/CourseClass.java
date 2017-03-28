//CMPT 220
//Author: Daniel Gisolfi
//Date: 3.26.17
//lab 8

//11.5

import java.util.ArrayList;
import java.util.Arrays;

public class CourseClass {
    public static void main(String[] args) {
    	//Create a new course
        Course course = new Course("Class");
        //Add all students 
        course.addStudent("Kayvan");
        course.addStudent("James");
        course.addStudent("Daniel");
        course.addStudent("Krendan");
        course.addStudent("Aidan");
        course.addStudent("Jack");
        course.addStudent("Kevin");
        course.addStudent("Chris");
        course.dropStudent("Maya");
        //Print course name
        System.out.println("Course: " + course.getCourseName());
        //print all students 
        System.out.println("Students: " + Arrays.toString(course.getStudents()));
        //Print number of students
        System.out.println("Student count: " + course.getNumberOfStudents());
    }
}

class Course {
    private String courseName;
    private ArrayList<String> students = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students.add(student);
    }

    public String[] getStudents() {
        return students.toArray(new String[students.size()]);
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        students.remove(student);
    }
}