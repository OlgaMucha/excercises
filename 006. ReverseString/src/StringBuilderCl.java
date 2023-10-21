import java.util.Scanner;

public class StringBuilderCl {

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter string to reverse: ");
        String s = scanner.nextLine();

        StringBuilder sb = new StringBuilder(s);
        StringBuilder reversedString = sb.reverse();

        System.out.println(" Reversed string: " + reversedString);

    }

}
