import java.util.ArrayList;
import java.util.Collections;

public class ArrayListNumbers {

    public ArrayList<Number> arrayNumbers;

    public ArrayListNumbers(ArrayList<Number> arrayNumbers) {
        this.arrayNumbers = arrayNumbers;
    }

    protected void shuffle(){
        Collections.shuffle(this.arrayNumbers);
    }
}
