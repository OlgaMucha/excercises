package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Olga Mucha"," ", " ", "0282865332","olga.mucha@gmail.com",Status.JUNIOR);
        System.out.println(student.toString());
        System.out.println("*****************************************************************");
        Employee employee = new Employee("Anna Laska", "Address1", "Address2", "025852222","o@onet.pl","Office2", 12, LocalDate.of(2022,12,15));
        System.out.println(employee.toString());
        System.out.println("*****************************************************************");
        Faculty faculty = new Faculty("Piotr Szczebrzeszyn","ul. Blues 15", "30855 Warderg", "0258564562","o@gmail.com","Office3",55,LocalDate.of(2021,4,15),"9-21",10);
        System.out.println(faculty.toString());
        System.out.println("*****************************************************************");
        Staff staff = new Staff("Richard Oost","Kirkjavegur 5","Reykjavik","0352485456","richard@reykjavik.is","Big office",40,LocalDate.of(2020,7,7),"Mr");
        System.out.println(staff.toString());
    }
}