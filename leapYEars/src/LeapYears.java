import java.util.ArrayList;

public class LeapYears {
    public static final int LOWER_LIMIT = 1900;
    public static final int UPPER_LIMIT = 2110;
    public static final int VALUES_PER_ROW = 10;
    /*(Display leap years) Write a program that displays all the leap years, 10 per line,
from 101 to 2100, separated by exactly one space. Also display the number of
leap years in this period.*/


    public static void main(String[] args) {
        ArrayList<Integer> arrayLeapYears = new ArrayList<>();

        arrayLeapYears = createArrayWithLeapYears();
        printOutput(arrayLeapYears);
    }

    /**method name: printOutput
     * method description: prints given array in rows per 10, space between entry
     * @param arrayLeapYears
     */
    private static void printOutput(ArrayList<Integer> arrayLeapYears) {
        int numberOfRows;
        boolean completeRows = (arrayLeapYears.size()%VALUES_PER_ROW == 0);
        if(completeRows) {
            numberOfRows = arrayLeapYears.size() / VALUES_PER_ROW;
        } else {
            numberOfRows = 1 + arrayLeapYears.size() / VALUES_PER_ROW;
        }
        for (int i = 1; i < numberOfRows; i++) {
            for (int j = 1; j <= VALUES_PER_ROW; j++) {
                System.out.print(arrayLeapYears.get((i - 1)*VALUES_PER_ROW + (j - 1)) + " ");
            }
            System.out.println();
        }
        // for last row
        int valuesInLastRow = arrayLeapYears.size() - (numberOfRows - 1)*VALUES_PER_ROW;
        for (int i = 1; i <= valuesInLastRow; i++) {
            System.out.print(arrayLeapYears.get((numberOfRows-1)*VALUES_PER_ROW + i - 1) + " ");
        }
    }

    /**method name: isALeapYear
     * method description: checks if year is a leap year and returns true or false
     * @param year
     * @return true or false
     */
    private static boolean isALeapYear(int year) {
        return year % 4 == 0;
    }

    /**method name: createArrayWithLeapYears
     * method description: create array will all leap years between two numbers
     * @return array
     */
    private static ArrayList<Integer> createArrayWithLeapYears(){
        ArrayList<Integer> arrayLeapYEarNumbers = new ArrayList<>();
        for (int i = LOWER_LIMIT; i < UPPER_LIMIT; i++) {
            if(isALeapYear(i)){
                arrayLeapYEarNumbers.add(i);
            }
        }
        return arrayLeapYEarNumbers;
    }

}

