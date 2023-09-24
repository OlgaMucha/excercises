import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class SumDigitsInteger {

    //(Sum the digits in an integer) Write a method that computes the sum of the digits
    //in an integer. Use the following method header:
    //public static int sumDigits(long n)
    //For example, sumDigits(234) returns 9 (= 2 + 3 + 4). (Hint: Use the % operator
    //to extract digits and the / operator to remove the extracted digit. For instance,
    //to extract 4 from 234, use 234 % 10 (= 4). To remove 4 from 234, use
    //234 / 10 (= 23). Use a loop to repeatedly extract and remove the digit until
    //all the digits are extracted. Write a test program that prompts the user to enter an
    //integer then displays the sum of all its digits.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        System.out.println();
        System.out.println("Sum of digits of integer " + number + " equals " + calculateSumDigitsInteger(number));
    }

    /**method name: calculateSumDigitsInteger
     * description: this method calculates total of digits of a given number
     * @param number (int)
     * @return sumOfDigits (int) sum of digits of given number
     */
    private static int calculateSumDigitsInteger(int number){
        ArrayList<Integer> array = new ArrayList<>();
        int sumOfDigits = 0;
        String numberAsString = String.valueOf(number);
        int numberOfDigits = numberAsString.length();

        for (int i = 0; i < numberOfDigits; i++) {
            array.add((int) (number/(Math.pow(10,i))%10));
        }

        sumOfDigits = sumElementsOfArray(array);
        return sumOfDigits;
    }

    /**method: sumElementsOfArray
     * description: calculates sum of elements of array of integers
     *
     * @param arrayList (ArrayList<Integer>)
     * @return sum (int)
     */
    private static int sumElementsOfArray(ArrayList<Integer> arrayList){
        int sum = 0;
        for (Integer integer : arrayList) {
            sum = sum + integer;
        }
        return sum;
    }
}
