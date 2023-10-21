import javax.swing.plaf.IconUIResource;
import java.util.Random;
import java.util.Scanner;

public class MultiplicationQuiz {

    public static final int NUMBER_OF_QUESTIONS = 5;

    public static void main(String[] args) {

        //3 times play game, if correct in 1 go - 1 point, if not, 0. For 3 correct - 12000, if 2 1000, 1 or less nothing
        int counter = 0;

        for (int i = 1; i <= NUMBER_OF_QUESTIONS; i++) {

            Random random = new Random();
            int randomInteger1 = random.nextInt(10);
            int randomInteger2 = random.nextInt(10);
            String question = "What is result of multiplication of " + randomInteger1 + " x " + randomInteger2 + " ? ";
            System.out.print(question);
            boolean condition;
            Scanner scanner = new Scanner(System.in);
            int result = scanner.nextInt();
            condition = result == randomInteger1 * randomInteger2;
            if(condition){
                counter = counter + 1;
            }
        }
        System.out.println("You have got " + counter + " points which is " + (int)100*counter/NUMBER_OF_QUESTIONS + "%");
    }
}





