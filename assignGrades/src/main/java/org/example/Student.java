package org.example;

import java.util.ArrayList;
public class Student {

    //region Getters&setters

    public int index;
    public int grade;

    public Student(int index, int grade) {
        this.index = index;
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }
    //endregion

    public static double getTheBestScore(ArrayList<Student> students){
        //ArrayList<Student> students = new ArrayList<>();
        double bestGrade = 0;
        for(Student student:students){
            double currentStudentGrade = student.getGrade();
            if(bestGrade < currentStudentGrade){
                bestGrade = currentStudentGrade;
            }
        }
        return bestGrade;
    }

    public char getGradeLetter(ArrayList<Student> students){
        char gradeLetter;
        double bestScore = Student.getTheBestScore(students);
        if(this.grade >= bestScore - 10){
            gradeLetter = 'A';
        }
        else if(this.grade >= bestScore - 20){
            gradeLetter = 'B';
        }
        else if(this.grade >= bestScore - 30){
            gradeLetter = 'C';
        }
        else if(this.grade >= bestScore - 40){
            gradeLetter = 'D';
        }
        else {
            gradeLetter = 'F';
        }
        return gradeLetter;
    }
}
