package org.example;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void test_getTheBestScore_throwsIllegalArgumentException() throws IllegalArgumentException {
        ArrayList<Student> students = new ArrayList<>();
        assertThrows(IllegalArgumentException.class, () -> {
            new Student(0,-55);
        });
    }

    @Test
    void test_getTheBestScore_ReturnsCorrectValue() throws IllegalArgumentException {
        ArrayList<Student> students = new ArrayList<>();
        Student student1 = new Student(0,55);
        Student student2 = new Student(1,70);
        Student student3 = new Student(2,40);
        students.add(student1);
        students.add(student2);
        students.add(student3);

        int bestScoreExpected = 70;
        assertEquals(Student.getTheBestScore(students), bestScoreExpected);
    }

    @Test
    void test_getTheBestScore_ReturnsZeroForNoStudents() {
        ArrayList<Student> students = new ArrayList<>();

        int bestScoreExpected = 0;
        assertEquals(Student.getTheBestScore(students), bestScoreExpected);
    }

    @Test
    void test_getGradeLetter_returnsCorrectGrades() {
        ArrayList<Student> students = new ArrayList<>();
        Student student1 = new Student(0,55);
        Student student2 = new Student(1,70);
        Student student3 = new Student(2,40);
        Student student4 = new Student(2,0);
        char actualGrade1 = 'B';
        char actualGrade2 = 'A';
        char actualGrade3 = 'C';
        char actualGrade4 = 'F';
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        assertEquals(student1.getGradeLetter(students),actualGrade1);
        assertEquals(student2.getGradeLetter(students),actualGrade2);
        assertEquals(student3.getGradeLetter(students),actualGrade3);
        assertEquals(student4.getGradeLetter(students),actualGrade4);

    }

    @Test
    void test_equals_twoStudentsAreEqualWhenIndexThisSame(){
        Student student1 = new Student(1,50);
        Student student2 = new Student(1,60);
        assertEquals(student1,student2);
    }
}