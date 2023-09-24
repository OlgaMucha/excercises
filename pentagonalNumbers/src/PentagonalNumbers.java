import java.util.ArrayList;

public class PentagonalNumbers {
    public static final int NUMBERS_PER_ROW = 10;
    public static final int LAST_PENTAGONAL_TO_PRINT = 100;
    public static final int FIRST_PENTAGONAL_TO_PRINT = 1;

    //(Math: pentagonal numbers) A pentagonal number is defined as n(3n-1)/2 for
    //n = 1, 2, . . ., and so on. Therefore, the first few numbers are 1, 5, 12, 22, ... .
    //Write a method with the following header that returns a pentagonal number:
    //public static int getPentagonalNumber(int n)
    //For example, getPentagonalNumber(1) returns 1 and getPentagonalNumber(
    //2) returns 5. Write a test program that uses this method to display the first
    //100 pentagonal numbers with 10 numbers on each line. Use the %7d format to
    //display each number.

    public static void main(String[] args) {
        System.out.println("Program calculating pentagonal numbers and putting them in rows of " + NUMBERS_PER_ROW);
        ArrayList<Integer> arrayPentagonals = new ArrayList<>();

        for (int i = FIRST_PENTAGONAL_TO_PRINT; i <= LAST_PENTAGONAL_TO_PRINT; i++) {
            arrayPentagonals.add(getPentagonalNumber(i));
        }
        printTableWithPentagonalNumbers(arrayPentagonals);
    }

    public static int getPentagonalNumber(int n) {
        int relatedPentagonal;
        relatedPentagonal = n * (3 * n - 1) / 2;
        return relatedPentagonal;
    }

    public static void printTableWithPentagonalNumbers(ArrayList<Integer> array) {
        int numberOfRows = (LAST_PENTAGONAL_TO_PRINT - FIRST_PENTAGONAL_TO_PRINT + 1) / NUMBERS_PER_ROW;
        //if there is an incomplete row, add extra row to number of rows
        if ((LAST_PENTAGONAL_TO_PRINT - FIRST_PENTAGONAL_TO_PRINT + 1) % NUMBERS_PER_ROW != 0) {
            numberOfRows = numberOfRows + 1;
        }

        for (int i = 1; i < numberOfRows + 1; i++) {
            if(i == numberOfRows){
                int numbersInLastRow =  array.size() - (NUMBERS_PER_ROW * (numberOfRows - 1));
                for (int k = 0; k < numbersInLastRow; k++) {
                    System.out.printf("%7d" ,array.get(NUMBERS_PER_ROW * (numberOfRows - 1) + k));
                }
                break;
            }
            for (int j = 1; j < NUMBERS_PER_ROW + 1; j++) {
                System.out.printf("%7d", array.get(NUMBERS_PER_ROW * (i - 1) + j - 1));
            }
            System.out.println();
        }
    }
}
