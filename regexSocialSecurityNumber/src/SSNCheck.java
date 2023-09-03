import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SSNCheck {
/*
        (Check SSN) Write a program that prompts the user to enter a Social Security
        number in the format DDD-DD-DDDD, where D is a digit. Your program should
        check whether the input is valid. Here are sample runs:
 */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Social Security number");

        String string = scanner.nextLine();

        String answer;

        if (isValidSSN(string))
            answer = "Valid SSD number";
        else {
            answer = "Invalid number";
        }

        System.out.println(answer);
    }

    public static boolean isValidSSN(String str)
    {
        // Regex to check SSN
        // (Social Security Number).
        String regex = "^(?!666|000|9\\d{2})\\d{3}"
                + "-(?!00)\\d{2}-"
                +"(?!0{4})\\d{4}$";

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);

        // If the string is empty
        // return false
        if (str == null)
        {
            return false;
        }

        // Pattern class contains matcher()
        //  method to find matching between
        //  given string and regular expression.
        Matcher m = p.matcher(str);

        // Return if the string
        // matched the ReGex
        return m.matches();
    }

}
