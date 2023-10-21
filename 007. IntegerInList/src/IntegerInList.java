import java.util.Scanner;

public class IntegerInList {

    public static void main(String[] args) {

        Integer[] list = { 5, -2, 23, 7, 87, -42, 50 };

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter number: ");
        Integer number = scanner.nextInt();
        Integer positionNumber = -1;

        for (int i = 0; i < list.length; i++) {
            if(list[i] == number){
                positionNumber = i;
                break;
            }
        }
        System.out.println(" position number: " + positionNumber);



    }

}
