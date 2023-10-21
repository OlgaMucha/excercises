import java.util.Scanner;

public class ShippingCost {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter weight of the package");
        double weightOfPackage = scanner.nextDouble();

        double cost = calculateCostOfShipping(weightOfPackage);
        String answer;
        if(cost == -1){
            answer = " We can't ship this package";
        } else if(cost == -2){
            answer = "Incorrect entry";
        } else {
            answer = " Cost of shipping is: " + calculateCostOfShipping(weightOfPackage);
        }
        System.out.println(answer);

    }

    private static double calculateCostOfShipping(double weight) {
        double costOfShipping;

        if (weight > 0 && weight <= 2) {
            costOfShipping = 2.5;
        } else if (weight > 2 && weight <= 4) {
            costOfShipping = 4.5;
        } else if (weight > 4 && weight <= 10) {
            costOfShipping = 7.5;
        } else if (weight > 10 && weight <= 20) {
            costOfShipping = 10.5;
        } else if (weight > 20) {
            costOfShipping = -1;
        } else {
            costOfShipping = -2;
        }
        return costOfShipping;
    }

}
