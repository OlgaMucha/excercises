/*
(Convert letter grade to number) Write a program that prompts the user to enter
a letter grade A, B, C, D, or F and displays its corresponding numeric value 4, 3,
2, 1, or 0. For other input, display invalid grade. Here is a sample run:
Enter a letter grade: B
The numeric value for grade B is 3
Enter a letter grade: T
T is an invalid grade
*/



import java.util.Scanner;

public class letterGradeToNumber {

    public static void main(String[] args) {

        System.out.print(" Write a letter grade: ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.nextLine();
        grade = grade.toUpperCase();
        String description = " The numeric value of for the grade ";

        switch (grade){
            case "A" :description = description + "A is " + 4;break;
            case "B" :description = description + "B is " + 3;break;
            case "C" :description = description + "C is " + 2;break;
            case "D" :description = description + "D is " + 1;break;
            case "F" :description = description + "F is " + 0;
            default: description = " Invalid Grade";
        }

        System.out.println(description);

    }

}
