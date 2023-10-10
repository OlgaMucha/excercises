package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        System.out.print("Enter " + numberOfStudents + " scores:");

        for (int i = 0; i < numberOfStudents; i++) {
            students.add(new Student(i,scanner.nextInt()));
        }

        for (Student student: students) {
            System.out.println("Student " + student.index + " score is " + (int)student.getGrade() + " and grade is " + student.getGradeLetter(students));
        }



    }
}