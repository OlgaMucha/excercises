import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String message;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer elements of array separating them with space: ");

        //numbers entered by user are entered in an array of strings
        String[] numbersAsStrings = scanner.nextLine().split(" ");

        //Elements of array of Strings is being parsed to int and saved into array list of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        for (String numbersAsString : numbersAsStrings) {
            int number = Integer.parseInt(numbersAsString);
            numbers.add(number);
        }

        //printing output in the screen
        if(NoTriples.checkIfTripleValues(numbers)){
            message = "No triple values";
        }else {
            message = "Triple values";
        }
        System.out.println(message);

        //******************* test1 with triples {1, 5, 1 , 5 , 1}, expected value of method = false // triple values

        ArrayList<Integer> numbersTest1 = new ArrayList<>();

        numbersTest1.add(1);
        numbersTest1.add(5);
        numbersTest1.add(1);
        numbersTest1.add(5);
        numbersTest1.add(1);

        boolean expectedResult1 = false;

        if(NoTriples.checkIfTripleValues(numbersTest1) == expectedResult1){
            System.out.println("Test 1 passed");
        } else {
            System.out.println("Test 1 failed");
        }

        //******************* test1 with triples {1, 5, 1 , 5}, expected value of method = true // no triple values

        ArrayList<Integer> numbersTest2 = new ArrayList<>();

        numbersTest2.add(1);
        numbersTest2.add(5);
        numbersTest2.add(1);
        numbersTest2.add(5);

        boolean expectedResult2 = true;

        if(NoTriples.checkIfTripleValues(numbersTest2) == expectedResult2){
            System.out.println("Test 2 passed");
        }else {
            System.out.println("Test 2 failed");
        }

        //******************* test1 with triples { }, expected value of method = true // no triple values

        ArrayList<Integer> numbersTest3 = new ArrayList<>();

        boolean expectedResult3 = true;

        if(NoTriples.checkIfTripleValues(numbersTest3) == expectedResult3){
            System.out.println("Test 3 passed");
        }else {
            System.out.println("Test 3 failed");
        }
    }
}