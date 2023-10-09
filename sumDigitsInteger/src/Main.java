import java.util.HashMap;

public class Main {
        public static void main(String[] args) {

            //testing
            //test cases
            int number1 = 123;
            int number2 = 456;
            int number3 = 0;
            int number4 = 555;

            //expected results
            int expectedResult1 = 6;
            int expectedResult2 = 15;
            int expectedResult3 = 0;
            int expectedResult4 = 15;

            int count = 1;

            //result test
            HashMap<Integer, Integer> setResults = new HashMap<>();
            setResults.put(number1, expectedResult1);
            setResults.put(number2, expectedResult2);
            setResults.put(number3, expectedResult3);
            setResults.put(number4, expectedResult4);

            for(int number: setResults.keySet()){
                int result = setResults.get(number);
                SumDigitsInteger sdi = new SumDigitsInteger(number);
                if(sdi.calculateSumDigitsInteger(number) == result){
                    System.out.println("test " + count + " passed");
                } else{
                    System.out.println("test " + count + " failed");
                }
                count++;
            }

    }
}