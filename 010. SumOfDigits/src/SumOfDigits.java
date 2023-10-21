import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        //Java program to find the sum of the digits of an integer using a while loop

        //example 1584 sum = 18

        int sumDigits;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();

        int sum = 0;
        //write digits of the number in the array list and calculate sum of elements array list
        for (int i = 0; i < 5; i++) {
             arrayList.add(i,(int)(number/Math.pow(10,i))%10);
             sum = sum + arrayList.get(i);
        }

        System.out.println(sum);

    }

}
