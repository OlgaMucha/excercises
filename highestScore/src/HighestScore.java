import java.util.*;

public class HighestScore {

    public static void main(String[] args) {

     /*   (Find the highest score) Write a program that prompts the user to enter the number
        of students and each student’s name and score, and finally displays the name
        of the student with the highest score. Use the next() method in the Scanner
        class to read a name, rather than using the nextLine() method. Assume that the
        number of students is at least 1.*/

        Map<Double, String> setUsers = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many students do you want to enter? ");
        int numberOfStudents = scanner.nextInt();
        while(numberOfStudents < 1){
            System.out.print("Number of student must be at least 1, please enter once again ");
            numberOfStudents = scanner.nextInt();
        }

        for (int i = 0; i < numberOfStudents; i++) {
            scanner.nextLine();
            System.out.print("Enter users name: ");
            String nameUser = scanner.nextLine();
            System.out.print("Enter users score: ");
            Double score = scanner.nextDouble();
            setUsers.put(score, nameUser);
        }

        TreeMap<Double, String> treeMap = new TreeMap<>(setUsers);

        System.out.println("Student with highest score is " + treeMap.lastEntry().getValue() + "  and has score " + treeMap.lastKey());
    }
}
