import java.util.ArrayList;
import java.util.Objects;

public class NoTriples {
    public static final int NUMBER_OF_THIS_SAME_VALUES = 3;


    /**method name: checkIfMultipleValues
     * description: checks if there are multiple this same values in given array list
     *
     * @param numbers array of integers
     * @return true if there are no triple values, false if yes
     */
    public static boolean checkIfTripleValues(ArrayList<Integer> numbers) {

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
