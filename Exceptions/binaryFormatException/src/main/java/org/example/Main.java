package org.example;

public class Main {
    public static void main(String[] args) {
        String stringBinary = "10801";
        BinaryToDecimal binaryToDecimal = new BinaryToDecimal(stringBinary);

        System.out.println(binaryToDecimal.verifyInputIsABinaryNumber(stringBinary));
    }
}