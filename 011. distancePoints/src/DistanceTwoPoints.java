import java.util.Scanner;

public class DistanceTwoPoints {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter two points: ");
        System.out.print(" First point x");
        double x1 = scanner.nextDouble();
        System.out.print(" First point y");
        double y1 = scanner.nextDouble();
        System.out.print(" Second point x");
        double x2 = scanner.nextDouble();
        System.out.print(" Second point y");
        double y2 = scanner.nextDouble();

        System.out.println(" Points entered: (" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + ")");

        double distance = Math.sqrt(Math.pow(x1 - x2,2) + Math.pow(y1 - y2,2));
        System.out.println("Distance between those points: " + distance);

    }


}
