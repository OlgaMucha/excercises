package org.example;

public class Main {
    public static void main(String[] args) throws BinaryFormatException {
        String stringBinary = "10101";
        try {
            BinaryToDecimal binaryToDecimal = new BinaryToDecimal(stringBinary);
        }catch(BinaryFormatException error){
            System.out.println("Not a binary");
        }

    }
}