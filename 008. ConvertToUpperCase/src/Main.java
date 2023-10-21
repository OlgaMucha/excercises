import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        //test cases
        String string1 = "Bubu";
        String string2 = "alle boeken";
        String string3 = "wit";
        String string4 = "rooD";
        String string5 = " ";

        //expected results
        String resultExpected1 = "BUBU";
        String resultExpected2 = "ALLE BOEKEN";
        String resultExpected3 = "WIT";
        String resultExpected4 = "ROOD";
        String resultExpected5 = " ";

        int count = 1;
        HashMap<String, String> setResults = new HashMap<>();
        setResults.put(string1, resultExpected1);
        setResults.put(string2, resultExpected2);
        setResults.put(string3, resultExpected3);
        setResults.put(string4, resultExpected4);
        setResults.put(string5, resultExpected5);


        for (String string : setResults.keySet()) {

            ConvertToUpperCase ctuc = new ConvertToUpperCase(string);
            String resultExpected = setResults.get(string);

            if (ctuc.toUpperCase(string).equals(resultExpected)) {
                System.out.println("test " + count + " passes");
            } else {
                System.out.println("test " + count + "  fails");
            }
            count++;
        }
    }
}




