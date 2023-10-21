import java.util.ArrayList;

public class PrimeNumbers {
    public static final int LOWER_LIMIT = 2;
    public static final int UPPER_LIMIT = 1200;
    public static final int NUMBERS_PER_ROW = 8;

    /*(Display prime numbers between 2 and 1,200)  Display eight
    prime numbers per line. Numbers are separated by exactly one space.*/

    public static void main(String[] args) {

        ArrayList<Integer> arrayPrimeNumbers = new ArrayList<>();

        creatingArrayWithPrimeNumbers(arrayPrimeNumbers);
        printOutput(arrayPrimeNumbers, NUMBERS_PER_ROW);
    }

    /**method name: creatingArrayWithPrimeNumbers
     * method description: creating array with prime numbers between two numbers
     * @param arrayPrimeNumbers
     */
    private static void creatingArrayWithPrimeNumbers(ArrayList<Integer> arrayPrimeNumbers) {
        for (int i = LOWER_LIMIT; i <= UPPER_LIMIT; i++) {
            if(isAPrimeNumber(i)){
                arrayPrimeNumbers.add(i);
            }
        }
    }


    /**method name: printOutput
     *method description: printing output of array of integers in rows of numbersPerRow given numbers per row
     * @param arrayNumbers
     */
    private static void printOutput(ArrayList<Integer> arrayNumbers, int numbersPerRow) {
       int howManyRows;
       if(arrayNumbers.size()% numbersPerRow == 0) {
           howManyRows = arrayNumbers.size() / numbersPerRow;
       }else{
           howManyRows = 1 + arrayNumbers.size() / numbersPerRow;
       }
        for (int i = 1; i < howManyRows; i++) {
            for (int j = 1; j <= numbersPerRow; j++) {
                System.out.print(arrayNumbers.get((i-1)*numbersPerRow + j) + " ");
            }
            //to next row
            System.out.println();
        }

        //printing last row separately, because it does not always have 8 digits to print
        int howManyNumberInLastRow;
        howManyNumberInLastRow = arrayNumbers.size() - (howManyRows - 1)*NUMBERS_PER_ROW;
        for (int i = 1; i < howManyNumberInLastRow; i++) {
                System.out.print(arrayNumbers.get((howManyRows-1)*NUMBERS_PER_ROW + i) + " ");
        }

    }

    /**method name: isAPrimeNumber
     * method description: checks if number is prime, if yes returns true, if not false
     * @param number to check if it is prime number
     * @return true for prime number, false for not prime number
     */

    private static boolean isAPrimeNumber(Integer number) {
        for(int i = 2;i <= number / 2;i++) {
            if((number % i) == 0)
                return false;
        }
        return true;
    }
}
