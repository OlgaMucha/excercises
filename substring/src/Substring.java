import java.util.Scanner;

public class Substring {

/*(Check substring) Write a program that prompts the user to enter two strings, and
    reports whether the second string is a substring of the first string.
    Enter string s1: ABCD
    Sting s2: BC
    BC is a substring of ABCD*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string s1: ");

        String string1 = scanner.nextLine();

        System.out.print("Enter string s2: ");

        String string2 = scanner.nextLine();

        if(string1.contains(string2)){
            System.out.println(string2 + " is a substring of " + string1);
        }else {
            System.out.println(string2 + " is not a substring of " + string1);
        }

    }
}
