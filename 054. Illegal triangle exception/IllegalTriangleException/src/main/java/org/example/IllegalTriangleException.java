package org.example;

public class IllegalTriangleException extends Exception{

    public IllegalTriangleException(String message) {
        message = "You cant create triangle with those side lengths";
    }
}
