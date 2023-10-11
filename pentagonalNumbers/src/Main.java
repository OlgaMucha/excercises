import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program calculating pentagonal numbers and putting them in rows of " + PentagonalNumbers.NUMBERS_PER_ROW);
        ArrayList<Integer> arrayPentagonals = new ArrayList<>();

        for (int i = PentagonalNumbers.FIRST_PENTAGONAL_TO_PRINT; i <= PentagonalNumbers.LAST_PENTAGONAL_TO_PRINT; i++) {
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
        int numberOfRows = (PentagonalNumbers.LAST_PENTAGONAL_TO_PRINT - PentagonalNumbers.FIRST_PENTAGONAL_TO_PRINT + 1) / PentagonalNumbers.NUMBERS_PER_ROW;
        //if there is an incomplete row, add extra row to number of rows

        for (int i = 1; i < numberOfRows + 1; i++) {
            if(i == numberOfRows){
                int numbersInLastRow =  array.size() - (PentagonalNumbers.NUMBERS_PER_ROW * (numberOfRows - 1));
                for (int k = 0; k < numbersInLastRow; k++) {
                    System.out.printf("%7d" ,array.get(PentagonalNumbers.NUMBERS_PER_ROW * (numberOfRows - 1) + k));
                }
                break;
            }
            for (int j = 1; j < PentagonalNumbers.NUMBERS_PER_ROW + 1; j++) {
                System.out.printf("%7d", array.get(PentagonalNumbers.NUMBERS_PER_ROW * (i - 1) + j - 1));
            }
            System.out.println();
        }
    }
}