import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a, b and c: ");

        int number1 = scanner.nextInt();
        quadraticEquation.setA(number1);

        int number2 = scanner.nextInt();
        quadraticEquation.setB(number2);

        int number3 = scanner.nextInt();
        quadraticEquation.setB(number3);

        Fraction[] array = quadraticEquation.changeToVertexForm();

        String output = quadraticEquation.vortexFormOutput(array);

        System.out.println(output);


    }

}
