import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lottery {

    public static void main(String[] args) {
        Random random = new Random();
        String resultOutputToUser;
        boolean conditionArraysEqual = false;
        boolean conditionSortedArraysEqual = false;
        boolean conditionOneDigitEqual = false;

        // computer lotes 3 random digits where 1 can't be 0
        int randomDigit1 = random.nextInt(10);
        while(randomDigit1 == 0){
            randomDigit1 = random.nextInt(10);
        }
        int randomDigit2 = random.nextInt(10);
        int randomDigit3 = random.nextInt(10);

        // user enters 3 digits
        Scanner scanner = new Scanner(System.in);
        int arrayRandomDigits[] = {randomDigit1, randomDigit2, randomDigit3};
        Arrays.sort(arrayRandomDigits);
        System.out.print("Enter 3 digits: ");
        int userDigit1 = scanner.nextInt();
        int userDigit2 = scanner.nextInt();
        int userDigit3 = scanner.nextInt();

        int arrayUserDigits[] = {userDigit1, userDigit2, userDigit3};
        Arrays.sort(arrayUserDigits);

        //check if all digit of both user and random are equal and in this same order
        conditionArraysEqual = ifArraysEqual(arrayRandomDigits, arrayUserDigits, conditionArraysEqual);

        Arrays.sort(arrayRandomDigits);
        Arrays.sort(arrayUserDigits);
        //checks if all digits are this same for user and random
        conditionSortedArraysEqual = ifArraysEqual(arrayUserDigits,arrayRandomDigits, conditionSortedArraysEqual);
        //check if 1 digit is this same for user and random
        conditionOneDigitEqual = isOneDigitEqual(arrayRandomDigits, arrayUserDigits, conditionOneDigitEqual);
        //checks and prints result to the screen
        outputToUser(conditionArraysEqual, conditionSortedArraysEqual, conditionOneDigitEqual);
    }

    private static void outputToUser(boolean conditionArraysEqual, boolean conditionOneDigitEqual, boolean conditionSortedArraysEqual) {
        String resultOutputToUser;
        if(conditionArraysEqual){
            resultOutputToUser = "HUGE WIN!!!! $12.000!!!";
        } else if (conditionSortedArraysEqual) {
            resultOutputToUser = "BIG WIN!!!! $5.000!!!";
        } else if (conditionOneDigitEqual) {
            resultOutputToUser = "You win $1000!!";
        } else {
            resultOutputToUser = "No win";
        }

        System.out.println(resultOutputToUser);
    }


    private static boolean isOneDigitEqual(int[] arrayRandomDigits, int[] arrayUserDigits, boolean conditionOneDigitEqual) {
        for (int i = 0; i < arrayUserDigits.length; i++) {
            if(arrayUserDigits[i] == arrayRandomDigits[i]){
                conditionOneDigitEqual = true;
                break;
            }
        }
        return conditionOneDigitEqual;
    }

    private static boolean ifArraysEqual(int[] array1, int[] array2, boolean conditionArraysEqual) {
        int counter = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i]){
                counter = counter + 1;
            }
            if (counter == array1.length){
                conditionArraysEqual = true;
            }
        }
        return conditionArraysEqual;
    }
}
