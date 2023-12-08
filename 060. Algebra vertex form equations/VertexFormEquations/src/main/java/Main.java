import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(1,3,1);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a, b and c: ");

        quadraticEquation.setA(scanner.nextInt());
        quadraticEquation.setB(scanner.nextInt());
        quadraticEquation.setC(scanner.nextInt());

        Fraction[] array = quadraticEquation.changeToVertexForm();

        String output = quadraticEquation.vortexFormOutput(array);

        System.out.println(output);


    }

}
