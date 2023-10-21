import java.util.Scanner;

public class PentagonArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter length from centre to vortex: ");
        double lengthToVortex = scanner.nextDouble();

        double sidePentagon = 2 * lengthToVortex * Math.sin(Math.PI / 5);

        double areaPentagon = (5 * sidePentagon * sidePentagon) / (4 * Math.tan((Math.PI/5)));
        double areaPentagonRondAf = Math.floor(areaPentagon * 100)/100;

        System.out.println(" Area pentagon is " + areaPentagonRondAf);
    }

}


































