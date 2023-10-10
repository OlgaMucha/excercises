package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student student1 = new Student("Anna", 58.5);
        Student student2 = new Student("Olga", 41.5);
        Student student3 = new Student("Add", 0.5);

        students.add(student1);
        students.add(student2);
        students.add(student3);

        double bestScore = Student.getTheBestScore(students);
        System.out.println(bestScore);

        System.out.println(student1.getGradeLetter(students));
        System.out.println(student2.getGradeLetter(students));
        System.out.println(student3.getGradeLetter(students));

    }
}