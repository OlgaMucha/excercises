import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex_058 {

    public static void main(String[] args) {

        ArrayList<Number> arrayList = new ArrayList<>(Arrays.asList(15,12.5,30,8));

        ArrayListNumbers arrayListNumbers = new ArrayListNumbers(arrayList);

        arrayListNumbers.shuffle();

        for(Number number: arrayList){
            System.out.print(number + " ");
        }
    }

}
