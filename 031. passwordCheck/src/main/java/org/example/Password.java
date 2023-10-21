package org.example;
//(Check password) Some Websites impose certain rules for passwords. Write a
//        method that checks whether a string is a valid password. Suppose the password
//        rules are as follows:
//        ■■ A password must have at least eight characters.
//        ■■ A password must contain only letters and digits.
//        ■■ A password must contain at least two digits.
//        Write a program that prompts the user to enter a password and displays Valid
//        Password if the rules are followed, or Invalid Password otherwise.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Password {

    public static final int MAX_LENGTH_PASSWORD = 8;
    public String passwordCharacters;

    public Password(String passwordCharacters) {
        this.passwordCharacters = passwordCharacters;
    }

    public boolean passwordCorrectCheck(){
        boolean passwordIsCorrect = false;
        if(this.passwordLengthCheck()&&this.passwordContainsOnlyLettersOrDigitsCheck()&&this.passwordContainsMinimumTwoDigits()){
            passwordIsCorrect = true;
        }
        return passwordIsCorrect;
    }

    //A password must have at least eight characters.
    private boolean passwordLengthCheck(){
        return this.passwordCharacters.length() >= MAX_LENGTH_PASSWORD;
    }

    //A password must contain only letters and digits.
    private boolean passwordContainsOnlyLettersOrDigitsCheck(){
        String passwordLowerCase = this.passwordCharacters.toLowerCase();
        boolean correctPassword = false;
        Character[] allowedCharacters = {'a', 'b', 'c', 'd','e','f','g','h','i','j','k','l','m','n','o','p','r','s','t','u','v','w','x','y','z',
        '0','1','2','3','4','5','6','7','8','9'};
        List<Character> listAllowedCharacters = new ArrayList<>(Arrays.asList(allowedCharacters));
        
        for (int i=0;i<this.passwordCharacters.length();i++) {
                correctPassword = listAllowedCharacters.contains(passwordLowerCase.charAt(i));
                if(!correctPassword){
                    break;
                }
        }
        return correctPassword;

    }

    //A password must contain at least two digits.
    private boolean passwordContainsMinimumTwoDigits(){
        boolean characterInPassword = false;
        boolean minimumTwoCharacterInPassword = false;
        Character[] digits = {'0','1','2','3','4','5','6','7','8','9'};
        List<Character> listDigits = new ArrayList<>(Arrays.asList(digits));

        int count = 0;
        for (int i=0;i<this.passwordCharacters.length();i++) {
            characterInPassword = listDigits.contains(this.passwordCharacters.charAt(i));
            if(characterInPassword){
                count++;
                if (count >= 2) {
                    minimumTwoCharacterInPassword = true;
                    break;
                }
            }

        }
        return  minimumTwoCharacterInPassword;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Password password = (Password) o;
        return Objects.equals(passwordCharacters, password.passwordCharacters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passwordCharacters);
    }
}
