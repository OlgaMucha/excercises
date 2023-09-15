import java.util.ArrayList;
import java.util.Scanner;

public class TemperatureConversion {


    public static void main(String[] args) {

        //region DATA DECLARATION
        ArrayList<Double> arrayOfFahrenheitTemp = new ArrayList<>();
        ArrayList<Double> arrayOfCelsiusTemp = new ArrayList<>();
        String temperatureType1;
        String temperatureType2;

        //endregion

        System.out.println("Convert temperature");
        System.out.println("1. C to F");
        System.out.println("2. F to C");
        System.out.println("3. Exit");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        //running program until user chooses correct entry
        boolean incorrectEntry = (choice < 1 || choice > 3);
        while (incorrectEntry) {
            System.out.println("choose 1, 2 or 3");
            choice = scanner.nextInt();
            if (choice == 1 || choice == 2 || choice == 3) {
                incorrectEntry = false;
            }
        }

        switch (choice) {
            case 1 -> {
                temperatureType1 = "Celsius";
                temperatureType2 = "Fahrenheit";
                Scanner input = new Scanner(System.in);
                convertingAndPrinting(temperatureType1, temperatureType2, input, arrayOfCelsiusTemp, arrayOfFahrenheitTemp);
            }
            case 2 -> {
                temperatureType1 = "Fahrenheit";
                temperatureType2 = "Celsius";
                Scanner input = new Scanner(System.in);
                convertingAndPrinting(temperatureType1, temperatureType2, input, arrayOfCelsiusTemp, arrayOfFahrenheitTemp);

            }
            case 3 -> System.exit(0);
            default -> System.out.println("Incorrect choice, try again");
        }
    }

    //region METHODS

    /**
     * function         : printOutput
     * description     : prints output of conversion F to C or C to F
     * @param temperatureInCelsius temp in celsius
     * @param temperatureInFahrenheit temp in fahrenheit
     */
    private static void printOutputLines(double temperatureInCelsius, double temperatureInFahrenheit) {
        String str3 = String.format("%-9.2f |%-9.2f",temperatureInCelsius, temperatureInFahrenheit);
        System.out.println(str3);
    }

    private static void printOutputHeader(){
        String str1 =String.format("%9s |%9s", "temp in C","temp in F");
        String str2 = "_____________________";
        System.out.println(str1);
        System.out.println(str2);
    }

    private static void printOutput(ArrayList<Double> arrayOfCelsiusTemp, ArrayList<Double> arrayOfFahrenheitTemp){
        printOutputHeader();
        for (int i = 0; i < arrayOfCelsiusTemp.size(); i++) {
            printOutputLines(arrayOfCelsiusTemp.get(i), arrayOfFahrenheitTemp.get(i));
        }
    }

    /**
     * function         : convertFahrenheitToCelsius
     * description      : converts given double value from fahrenheit to celsius temperature
     * @param temperatureInFahrenheit temp in fahrenheit
     * @return temperatureInCelsius temp in celsius
     */
    private static double convertFahrenheitToCelsius(double temperatureInFahrenheit) {
        double temperatureInCelsius;
        temperatureInCelsius = (float)5/9  * (temperatureInFahrenheit - 32);
        return temperatureInCelsius;
    }

    /**
     * function         : convertCelsiusToFahrenheit
     * description      : converts given double value from celsius to fahrenheit temperature
     * @param temperatureInCelsius temp in celsius
     * @return temperatureInFahrenheit
     */

    private static double convertCelsiusToFahrenheit(double temperatureInCelsius) {
        double temperatureInFahrenheit;
        temperatureInFahrenheit = temperatureInCelsius * 9/5 + 32;
        return temperatureInFahrenheit;
    }

    private static void convertingAndPrinting(String param1, String param2, Scanner scanner, ArrayList<Double> arrayOfCelsiusTemp, ArrayList<Double> arrayOfFahrenheitTemp){
        String questionConversion = "Give temperature in " + param1 + " to convert to " + param2 + ": ";
        String questionForOneMoreInput = "One more input? ";
        System.out.println(questionConversion);
        double toConvertCToF;
        double toConvertFToC;
        if (param1.equals("Celsius")){
            toConvertCToF = scanner.nextDouble();

            arrayOfCelsiusTemp.add(toConvertCToF);
            arrayOfFahrenheitTemp.add(convertCelsiusToFahrenheit(toConvertCToF));
        } else {
            toConvertFToC = scanner.nextDouble();

            arrayOfCelsiusTemp.add(convertFahrenheitToCelsius(toConvertFToC));
            arrayOfFahrenheitTemp.add(toConvertFToC);
        }

        System.out.println(questionForOneMoreInput);
        scanner.nextLine();
        String nextCalculation = scanner.nextLine();
        boolean goOn = (nextCalculation.equals("y") || nextCalculation.equals("Y"));
        if(!goOn){
            printOutput(arrayOfCelsiusTemp, arrayOfFahrenheitTemp);
        }
        while (goOn) {
            if(param1.equals("Celsius")){
                System.out.println(questionConversion);
                toConvertCToF = scanner.nextDouble();

                arrayOfCelsiusTemp.add(toConvertCToF);
                arrayOfFahrenheitTemp.add(convertCelsiusToFahrenheit(toConvertCToF));
            } else {
                System.out.println(questionConversion);
                toConvertFToC = scanner.nextDouble();

                arrayOfCelsiusTemp.add(convertFahrenheitToCelsius(toConvertFToC));
                arrayOfFahrenheitTemp.add(toConvertFToC);
            }

            System.out.println(questionForOneMoreInput);
            scanner.nextLine();
            nextCalculation = scanner.nextLine();
            if (!nextCalculation.equals("y") && !nextCalculation.equals("Y")) {
                printOutput(arrayOfCelsiusTemp, arrayOfFahrenheitTemp);
                goOn = false;
            }
        }
    }

    //endregion
}
