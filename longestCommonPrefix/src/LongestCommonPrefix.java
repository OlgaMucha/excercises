import java.util.Scanner;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        //(Longest common prefix) Write a program that prompts the user to enter two
        //strings and displays the largest common prefix of the two strings. Here are some
        //sample runs:
        //Enter the first string: Welcome to C++
        //Enter the second string: Welcome to programming
        //The common prefix is Welcome to
        //Enter the first string: Atlanta
        //Enter the second string: Macon
        //Atlanta and Macon have no common prefix

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string: ");
        System.out.print("First string: ");
        String firstString = scanner.nextLine();

        System.out.println("Enter second string: ");
        System.out.print("Second string: ");
        String secondString = scanner.nextLine();

        String shortestString;
        //check until length of the shortest string
        if(firstString.length()<=secondString.length()){
            shortestString = firstString;
        } else {
            shortestString = secondString;
        }

        if(checkCommonPrefix(firstString, secondString, shortestString).equals("")){
            System.out.println("No common prefix");
        }else {
            System.out.println("Common prefix is: " + checkCommonPrefix(firstString, secondString, shortestString));
        }

    }

    private static String checkCommonPrefix(String firstString, String secondString, String shortestString) {
        int counter = 0;
        String commonString = "";
        for (int i = 0; i < shortestString.length(); i++) {
            if(firstString.charAt(i) == secondString.charAt(i)){
                counter = counter + 1;
            } else {
                break;
            }
        }

        for (int i = 0; i < counter; i++) {
            commonString = commonString + shortestString.charAt(i);
        }
        return commonString;
    }

}
