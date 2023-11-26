package org.example;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberFormatUser {

    public NumberFormatUser() {
    }

    //user entry
    private int userEntryNumberType() {
        Scanner scanner = new Scanner(System.in);
        boolean correctInput = false;
        int userEntry = 0;
        List<Integer> listCorrectEntries = new ArrayList<>(Arrays.asList(2, 8, 10, 16));
        do {
            System.out.println("""
                    What type of number do you want to get.
                    Choose:\s
                     2 for binary,\s
                     8 for octal,\s
                    10 for decimal\s
                    16 for hexadecimal""");
                userEntry = scanner.nextInt();
                if (listCorrectEntries.contains(userEntry)) {
                    correctInput = true;
                }else {
                    System.out.println("Incorrect entry, try again");
                }
            }
        while (!correctInput);
        return userEntry;

    }

    public String userEntryNumberToCheck() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number you want to check");
        return scanner.nextLine();
    }

    public String getRegexForUserChoice() {
        int usersChoice = this.userEntryNumberType();
        String matchingRegex = "";
        switch (usersChoice) {
            case 2:
                return "^[01]+";
            case 8:
                return "^[0-7]+";
            case 10:
                return "^[0-9]+";
            case 16:
                return "^[0-9a-fA-F]+";
            default://should never happen
                return "Incorrect entry";
        }
    }

    public void applyRegexToCheckNumber(){
        String numberToCheck = this.userEntryNumberToCheck();
        String regex = this.getRegexForUserChoice();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(numberToCheck);

        if(matcher.matches()){
            System.out.println("Correct!");
        }else{
            System.out.println("Incorrect!");
        }
    }

}


