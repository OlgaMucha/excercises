import java.util.Objects;
import java.util.Scanner;

public class Areas {

    public static void main(String[] args) {

        System.out.println("Choose what you wat to calculate");
        System.out.println("1. Area of triangle");
        System.out.println("2. Area of quadrangle");
        System.out.println("3. Area of pentagon");
        System.out.println("4. Area of hexagon");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        String answer;
        double area;

        switch (choice) {
            case 1: area = calculateAreaTriangle();break;
            case 2: area = calculateAreaQuadrangle();break;
            case 3: area = calculateAreaPentagon();break;
            case 4: area = calculateAreaHexagon();break;
            default: System.out.println(" Incorrect input");area = -1;
        }

        if(area == -1){
            answer = "Incorrect entry";
        } else {
            answer = "area is " + area;
        }
        System.out.println(answer);
    }

    private static double calculateAreaTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Has your triangle all sides this same? Y/N");
        String yesOrNo = scanner.nextLine();
        yesOrNo = yesOrNo.toUpperCase();
        if (Objects.equals(yesOrNo, "Y")) {
            System.out.print("Enter side: ");
            double side = scanner.nextDouble();
            double area = side * side * Math.sqrt(3) / 4;
            System.out.println("Area of this triangle is: " + area);
            return area;
        } else if (Objects.equals(yesOrNo, "N")) {
            System.out.print("Enter side: ");
            double side = scanner.nextDouble();
            System.out.print("Enter height: ");
            double height = scanner.nextDouble();
            double area = side * height / 2;
            System.out.println("Area of this triangle is: " + area);
            return area;
        } else {
            System.out.println(" incorrect entry");
            return -1;
        }

    }

    private static double calculateAreaQuadrangle() {
        System.out.print("Enter first side of the quadrangle: ");
        Scanner scanner = new Scanner(System.in);
        double side1 = scanner.nextDouble();

        System.out.print("Enter second side of the quadrangle: ");
        double side2 = scanner.nextDouble();
        double area = side1 * side2;
        return area;
    }

    private static double calculateAreaPentagon() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter length from centre to vortex: ");
        double lengthToVortex = scanner.nextDouble();
        double side = 2 * lengthToVortex * Math.sin(Math.PI / 5);
        double area = (5 * side * side) / (4 * Math.tan((Math.PI/5)));
        System.out.println(" Area pentagon is " + area);
        return area;
    }

    private static double calculateAreaHexagon() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter side of hexagon: ");
        double side = scanner.nextDouble();
        double area = (3 * Math.sqrt(3)*side * side)/2;
        return area;
    }







}
