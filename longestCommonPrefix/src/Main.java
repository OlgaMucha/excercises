import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first string: ");
        System.out.print("First string: ");
        String firstString = scanner.nextLine();

        System.out.println("Enter second string: ");
        System.out.print("Second string: ");
        String secondString = scanner.nextLine();

        String shortestString;
        //check until length of the shortest string
        shortestString = (firstString.length()<=secondString.length()) ? firstString : secondString;

        LongestCommonPrefix lcp = new LongestCommonPrefix(firstString,secondString);

        if(lcp.checkCommonPrefix(firstString, secondString, shortestString).equals("")){
            System.out.println("No common prefix");
        }else {
            System.out.println("Common prefix is: " + lcp.checkCommonPrefix(firstString, secondString, shortestString));
        }

    }
}