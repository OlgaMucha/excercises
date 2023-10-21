//(The longest common prefix) Write a program that prompts the user to enter two
//strings and displays the largest common prefix of the two strings. Here are some
//sample runs:
//Enter the first string: Welcome to C++
//Enter the second string: Welcome to programming
//The common prefix is Welcome to
//Enter the first string: Atlanta
//Enter the second string: Macon
//Atlanta and Macon have no common prefix

public class LongestCommonPrefix {

    public String firstString;
    public String secondString;

    public LongestCommonPrefix(String firstString, String secondString) {
        this.firstString = firstString;
        this.secondString = secondString;
    }

    public String checkCommonPrefix(String firstString, String secondString, String shortestString) {
        int counter = 0;
        StringBuilder commonString = new StringBuilder();
        for (int i = 0; i < shortestString.length(); i++) {
            if(firstString.charAt(i) == secondString.charAt(i)){
                counter = counter + 1;
            } else {
                break;
            }
        }

        for (int i = 0; i < counter; i++) {
            commonString.append(shortestString.charAt(i));
        }
        return commonString.toString();
    }

}
