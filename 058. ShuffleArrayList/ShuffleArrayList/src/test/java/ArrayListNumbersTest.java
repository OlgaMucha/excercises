import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListNumbersTest {

    @Test
    public void given_nullArray_when_shuffle_then_returnsEmptyArray(){
        //given
        ArrayList<Number> arrayList = null;
        ArrayListNumbers cut = new ArrayListNumbers(arrayList);

        //when
        cut.shuffle();

        //then
        Assertions.assertNull(cut.getArrayNumbers());
    }

    @Test
    public void given_arrayWithZeroElements_when_shuffle_then_returnsThisSameArray(){
        //given
        ArrayList<Number> arrayList = new ArrayList<>(List.of());
        ArrayListNumbers cut = new ArrayListNumbers(arrayList);

        //when
        cut.shuffle();

        //then
        Assertions.assertEquals(new ArrayList<>(List.of()),cut.getArrayNumbers());
    }

    @Test
    public void given_arrayHasOnlyNumberZero_when_shuffle_then_returnsThisSameArray(){
        //given
        ArrayList<Number> arrayList = new ArrayList<>(List.of(0));
        ArrayListNumbers cut = new ArrayListNumbers(arrayList);

        //when
        cut.shuffle();

        //then
        Assertions.assertEquals(new ArrayList<>(List.of(0)),cut.getArrayNumbers());
    }

    @Test
    public void given_arrayHasOneNumberThatIsNegative_when_shuffle_then_returnsThisSameArray(){
        //given
        ArrayList<Number> arrayList = new ArrayList<>(List.of(-1));
        ArrayListNumbers cut = new ArrayListNumbers(arrayList);

        //when
        cut.shuffle();

        //then
        Assertions.assertEquals(new ArrayList<>(List.of(-1)),cut.getArrayNumbers());
    }

    @Test
    public void given_arrayHasTwoNumbers_when_shuffle_then_returnsThisSameArrayListOrArrayListWithReversedOrder(){
        //given
        ArrayList<Number> arrayList = new ArrayList<>(List.of(1,2));
        ArrayListNumbers cut = new ArrayListNumbers(arrayList);

        //when
        cut.shuffle();

        //then
        Assertions.assertTrue(cut.getArrayNumbers().equals(new ArrayList<>(List.of(1,2))) ||
                cut.getArrayNumbers().equals(new ArrayList<>(List.of(2, 1))));
    }

    @Test
    public void given_arrayHasThreeNumbers_when_shuffle_then_resultArrayContainsThoseThreeNumbers(){
        //given
        ArrayList<Number> arrayList = new ArrayList<>(List.of(1,2,3));
        ArrayListNumbers cut = new ArrayListNumbers(arrayList);

        //when
        cut.shuffle();

        //then
        Assertions.assertTrue(
                cut.getArrayNumbers().contains(1) &&
                        cut.getArrayNumbers().contains(2) &&
                        cut.getArrayNumbers().contains(3)
                );
    }

    @Test
    public void given_arrayListNumbersContainsOnlyThisSameNumber_when_shuffle_then_resultIsThisSameArrayList(){
        //given
        ArrayList<Number> arrayList = new ArrayList<>(List.of(1,1,1));
        ArrayListNumbers cut = new ArrayListNumbers(arrayList);

        //when
        cut.shuffle();

        //then
        Assertions.assertEquals(new ArrayList<>(List.of(1,1,1)),cut.getArrayNumbers());
    }

    @Test
    public void given_emptyArrayListNumbers_when_shuffle_then_resultArrayHasSizeZero(){
        //given
        ArrayList<Number> arrayList = new ArrayList<>(List.of());
        ArrayListNumbers cut = new ArrayListNumbers(arrayList);

        //when
        cut.shuffle();

        //then
        Assertions.assertEquals(0,cut.getArrayNumbers().size());
    }

    @Test
    public void given_arrayListNumbersWithOneNumber_when_shuffle_then_resultArrayHasSizeOne(){
        //given
        ArrayList<Number> arrayList = new ArrayList<>(List.of(1));
        ArrayListNumbers cut = new ArrayListNumbers(arrayList);

        //when
        cut.shuffle();

        //then
        Assertions.assertEquals(1,cut.getArrayNumbers().size());
    }

    @Test
    public void given_arrayHasThreeNumbers_when_shuffle_then_resultArrayHasSizeThree(){
        //given
        ArrayList<Number> arrayList = new ArrayList<>(List.of(1,2,3));
        ArrayListNumbers cut = new ArrayListNumbers(arrayList);

        //when
        cut.shuffle();

        //then
        Assertions.assertEquals(3,cut.getArrayNumbers().size());
    }

    @Test
    public void given_arrayListNumbersContainsNumberXTimes_when_shuffle_then_resultArrayListWillContainThisNumberXTimes(){
        //given
        ArrayList<Number> arrayList = new ArrayList<>(List.of(1,1,1,1,6,1));
        ArrayListNumbers cut = new ArrayListNumbers(arrayList);
        int containsOneXTimes = 5;

        //when
        cut.shuffle();

        //then
        int count = 0;
        for(Number number: cut.getArrayNumbers()){
            if(number.equals(1)){
                count++;
            }
        }
        Assertions.assertEquals(5,count);

    }

}