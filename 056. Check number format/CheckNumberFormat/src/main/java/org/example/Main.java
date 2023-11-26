package org.example;

public class Main {
    public static void main(String[] args) {

        NumberFormatUser numberFormatUser = new NumberFormatUser();
        String numberToCheck = numberFormatUser.userEntryNumberToCheck();
        int usersChoiceTypeAsNumber = numberFormatUser.userEntryNumberType();

        String regex = numberFormatUser.getRegexForUserChoice(usersChoiceTypeAsNumber);

        numberFormatUser.applyRegexToCheckNumber(numberToCheck,regex);

    }
}