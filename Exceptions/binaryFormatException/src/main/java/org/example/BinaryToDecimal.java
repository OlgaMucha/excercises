package org.example;

import java.util.ArrayList;

public class BinaryToDecimal {

    public String binaryNumberString;

    public BinaryToDecimal(String binaryNumberString) throws BinaryFormatException {
        if(!this.verifyInputIsABinaryNumber(binaryNumberString)) {
            throw new BinaryFormatException();
        }
        this.binaryNumberString = binaryNumberString;
    }

    public boolean verifyInputIsABinaryNumber(String binaryString) {
        boolean inputIsBinary = false;

        //writing characters of the string into arraylist
        ArrayList<Character> listOfCharacters = new ArrayList<>();
        for (int i = 0; i < binaryString.length(); i++) {
            listOfCharacters.add(binaryString.charAt(i));
        }

        //counting number of characters '0' and '1' in the arraylist
        int count = 0;
        for (Character character : listOfCharacters) {
            if (character == '0' || character == '1') {
                count = count + 1;
            }
        }

        //checking if count equals total number characters in the input string,
        // otherwise there must be another character then '0' and '1' - non-binary
        if (count == listOfCharacters.size()) {
            inputIsBinary = true;
        }
        return inputIsBinary;
    }
}


