import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class NoTriples {
    public static final int NUMBER_OF_THIS_SAME_VALUES = 3;

    //Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
    // Return true if the array does not contain any triples.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer elements of array separating them with space: ");

        //numbers entered by user are entered in an array of strings
        String[] numbersAsStrings = scanner.nextLine().split(" ");

        //Elements of array of Strings is being parsed to int and saved into array list of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < numbersAsStrings.length; i++) {
            int number = Integer.parseInt(numbersAsStrings[i]);
            numbers.add(number);
        }

        //printing output in the screen
        if(checkIfTripleValues(numbers)){
            System.out.println("No triple values");
        }else {
            System.out.println("Triple values");
        }

    }

    /**method name: checkIfMultipleValues
     * description: checks if there are multiple this same values in given array list
     *
     * @param numbers array of integers
     * @return true if there are no triple values, false if yes
     */
    private static boolean checkIfTripleValues(ArrayList<Integer> numbers) {

        for (int i = 0; i < numbers.size(); i++) {
            int counter = 1;
            for (int j = i + 1; j < numbers.size(); j++) {
                if(Objects.equals(numbers.get(i), numbers.get(j))){
                    counter = counter + 1;
                }
                if(counter == NUMBER_OF_THIS_SAME_VALUES){
                    return false;
                }
            }
        }
        return true;
    }
}
