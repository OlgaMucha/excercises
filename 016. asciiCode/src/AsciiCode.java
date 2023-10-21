import java.util.Scanner;

public class AsciiCode {

    public static void main(String[] args) {
        System.out.print(" Enter a character: ");

        Scanner scanner = new Scanner(System.in);

        char character = scanner.next().charAt(0);//how to read character in scanner

        int ascii = (int) character;

        System.out.println(character + " is " + ascii + " in Ascii");
    }
}
