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
        ArrayList<Character> listOfCharacters = new ArrayList<>();
        for (int i = 0; i < binaryString.length(); i++) {
            listOfCharacters.add(binaryString.charAt(i));
        }
        int count = 0;
        for (Character character : listOfCharacters) {
            if (character == '0' || character == '1') {
                count = count + 1;
            }
        }
        if (count == listOfCharacters.size()) {
            inputIsBinary = true;
        }
        return inputIsBinary;
    }
}


