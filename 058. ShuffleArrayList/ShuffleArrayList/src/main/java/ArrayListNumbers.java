import java.util.ArrayList;
import java.util.Collections;

public class ArrayListNumbers {

    //region constructor, getters&setters
    public ArrayList<Number> arrayNumbers;

    public ArrayList<Number> getArrayNumbers() {
        return arrayNumbers;
    }

    public void setArrayNumbers(ArrayList<Number> arrayNumbers) {
        this.arrayNumbers = arrayNumbers;
    }

    public ArrayListNumbers(ArrayList<Number> arrayNumbers) {
        this.arrayNumbers = arrayNumbers;
    }
    //endregion

    protected void shuffle(){
        if(arrayNumbers == null){
            this.arrayNumbers = null;
        }else {
            Collections.shuffle(this.arrayNumbers);
        }
    }
}
