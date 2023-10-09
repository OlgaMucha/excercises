import java.util.ArrayList;

//(Sum the digits in an integer) Write a method that computes the sum of the digits
//in an integer. Use the following method header:
//public static int sumDigits(long n)
//For example, sumDigits(234) returns 9 (= 2 + 3 + 4).

public class SumDigitsInteger {
    public int number;

    public SumDigitsInteger(int number) {
        this.number = number;
    }

    /**method name: calculateSumDigitsInteger
     * description: this method calculates total of digits of a given number
     * @param number (int)
     * @return sumOfDigits (int) sum of digits of given number
     */
    public int calculateSumDigitsInteger(int number){
        ArrayList<Integer> array = new ArrayList<>();
        int sumOfDigits;
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
    public int sumElementsOfArray(ArrayList<Integer> arrayList){
        int sum = 0;
        for (Integer integer : arrayList) {
            sum = sum + integer;
        }
        return sum;
    }
}
