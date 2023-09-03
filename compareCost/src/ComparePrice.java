import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ComparePrice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Compare price program");

        double weightFirstPackage;
        do {
            System.out.print("Give weight of first package in g");
            weightFirstPackage = scanner.nextDouble();
        }
        while (weightFirstPackage == 0);

        System.out.print("Give price of first package");
        double priceFirstPackage = scanner.nextDouble();

        double pricePer100GramFirstPackage = 100*priceFirstPackage/weightFirstPackage;

        double weightSecondPackage;
        do{
            System.out.print("Give weight of first package in g");
            weightSecondPackage = scanner.nextDouble();
        }
        while (weightSecondPackage == 0);

        System.out.print("Give price of second package");
        double priceSecondPackage = scanner.nextDouble();

        double pricePer100GramSecondPackage = 100* priceSecondPackage/weightSecondPackage;

        System.out.println(" First package: " + weightFirstPackage  + "g, " + priceFirstPackage + "€, price per 100g: " + pricePer100GramFirstPackage);
        System.out.println(" Second package: " + weightSecondPackage  + "g, " + priceSecondPackage + "€, price per 100g: " + pricePer100GramSecondPackage);
        System.out.println(comparePriceTwoPackages(pricePer100GramFirstPackage, pricePer100GramSecondPackage));
    }

    private static String comparePriceTwoPackages(double pricePerGramFirstPackage, double pricePerGramSecondPackage) {
        if(pricePerGramFirstPackage > pricePerGramSecondPackage){
            return "Second package is cheaper";
        } else if(pricePerGramFirstPackage == pricePerGramSecondPackage) {
            return "Both packages have this same price";
        } else {
            return "First package is cheaper";
        }
    }

}
