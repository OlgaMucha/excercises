import java.util.*;

public class ScissorsStonePaper {
    public static final int MAX_DIFFERENCE_IN_RESULTS = 2;

        /*(Game: scissor, rock, paper) Programming Exercise 3.17 gives a program that
        plays the scissors–rock–paper game. Revise the program to let the user continuously
        play until either the user or the computer wins more than two times than its
        opponent.
        Rock wins against scissors; paper wins against rock; and scissors wins against paper.*/

    public static void main(String[] args) {
        int sumWinsUser = 0;
        int sumWinsComputer = 0;
        String userString = "";
        String computersString = "";

     //game will be played until the difference between user score and computer score is 2
     while(((sumWinsComputer - sumWinsUser <= MAX_DIFFERENCE_IN_RESULTS - 1)&&(sumWinsComputer - sumWinsUser >= 0))
             || ((sumWinsUser - sumWinsComputer <= MAX_DIFFERENCE_IN_RESULTS - 1)&&(sumWinsUser - sumWinsComputer >= 0))){

        int play = winnerInSingleGame();
        if (play == 1) {
            sumWinsUser = sumWinsUser + (MAX_DIFFERENCE_IN_RESULTS - 1);
            userString = userString.concat("|");
        } else if (play == -1) {
            sumWinsComputer = sumWinsComputer + (MAX_DIFFERENCE_IN_RESULTS - 1);
            computersString = computersString.concat("|");
        }

         System.out.println("You: " + userString +  " Computer: " + computersString);
    }


        if(sumWinsComputer > sumWinsUser){
            System.out.println("YOU LOOSE");
        } else{
            System.out.println("YOU WIN");
        }

    }

    /**method name: playSingleGame
     * method description: simulates rock-scissors-paper game
     * @return true if someone won, false if no-one won
     */
    private static Integer winnerInSingleGame(){
        int valueReturn = 0;
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> namesMap = new HashMap<>();
        namesMap.put(1,"scissors");
        namesMap.put(MAX_DIFFERENCE_IN_RESULTS,"rock");
        namesMap.put(3,"paper");

        //user input
        System.out.println("""
                You choose
                1. scissors
                2. rock
                3. paper""");

        int user = scanner.nextInt();
        System.out.println("You chose " + namesMap.get(user));

        //computer's input - random number 1 to 3
        Random rand = new Random();

        int computer = rand.nextInt(3) + 1;
        System.out.println("Computer chose " + namesMap.get(computer));

        String result;
        int userPoints = 0;
        int computerPoints = 0;

        //results of playing
        //Rock wins against scissors; paper wins against rock; and scissors wins against paper
        if(user == computer){
            result = "no winner";
        } else if(user == 1 && computer == 3){
            result = "you win";
            userPoints = 1;
        } else if(user == MAX_DIFFERENCE_IN_RESULTS && computer == 1){
            result = "you win";
            userPoints = 1;
        } else if(user == 3 && computer == MAX_DIFFERENCE_IN_RESULTS){
            result = "you win";
            userPoints = 1;
        } else {
            result = "computer wins";
            computerPoints = 1;
        }
        //if user wins, return value is 1, if computer wins value is -1, no win = 0
        System.out.println(result);
        if(userPoints == 1){
            valueReturn = 1;
        } else if(computerPoints == 1){
            valueReturn = -1;
        }
        return valueReturn;
    }
}
