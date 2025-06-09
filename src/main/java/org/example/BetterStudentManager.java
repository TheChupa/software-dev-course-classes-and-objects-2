package org.example;

// In a separate (adjacent) file, create a Student class with two public members:
// - A String member called name
// - A double member called grade

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BetterStudentManager {
    public List<Student> students = new ArrayList<>();

    public void addStudent(String name, double grade) {
        // Add new student with Java Class
        Student student = new Student();
        student.name = name;
        student.grade = grade;
        students.add(student);

    }

    public void removeStudent(String name) {
        // Loop through the students ArrayList at each index and compares the name and then removes it if equal to it.
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).name.equals(name)) {
                students.remove(i);

            }
        }
    }

    public String getStudentList() {
   // Stringbuiler is the new student list, then append the value that the object represents to it. then return it as a string
        StringBuilder studentList = new StringBuilder();

        for (Student student : students) {

            studentList.append(student.name).append(" ").append(student.grade).append("\n");

        }
        return studentList.toString();
    }
}