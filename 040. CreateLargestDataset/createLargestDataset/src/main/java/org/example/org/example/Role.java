package org.example;

public enum Role {
    Associate,
    Assistant,
    Full;


    public static Enum enumMethod() { //method

        int lower = 1;
        int upper = 3;
        int random = (int)(Math.random() * (upper - lower)) + lower;
        Enum theRole = null;

        switch (random){
            case 1: theRole = Role.Assistant;
            case 2: theRole = Role.Associate;
            case 3: theRole = Role.Full;
        }
        return theRole;
    }
    }