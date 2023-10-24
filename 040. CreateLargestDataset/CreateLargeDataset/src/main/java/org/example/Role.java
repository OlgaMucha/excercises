package org.example;

public enum Role {

    Associate,
    Assistant,
    Full;


    public static Role enumMethod() { //method

        int lower = 1;
        int upper = 3;
        //int random = (int)(Math.random() * (upper - lower)) + lower;
        int random = lower + (int)(Math.random() * ((upper - lower) + 1));

        Role theRole = null;
        return switch (random) {
            case 1 -> Role.Assistant;
            case 2 -> Role.Associate;
            case 3 -> Role.Full;
            default -> theRole;
        };
    }

}
