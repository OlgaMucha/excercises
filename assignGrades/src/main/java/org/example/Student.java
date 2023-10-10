package org.example;//(Assign grades) Write a program that reads student scores, gets the best score, and
//then assigns grades based on the following scheme:
//Grade is A if score is >= best - 10;
//Grade is B if score is >= best - 20;
//Grade is C if score is >= best - 30;
//Grade is D if score is >= best - 40;
//Grade is F otherwise.
//The program prompts the user to enter the total number of students, then prompts
//the user to enter all of the scores, and concludes by displaying the grades. Here is
//a sample run:
//Enter the number of students: 4
//Enter 4 scores: 40 55 70 58
//org.example.Student 0 score is 40 and grade is C
//org.example.Student 1 score is 55 and grade is B
//org.example.Student 2 score is 70 and grade is A
//org.example.Student 3 score is 58 and grade is B
//7.2

import java.util.ArrayList;

public class Student {

    //region Getters&setters

    public String name;
    public double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
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
