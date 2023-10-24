package org.example;

public enum Role {

    associate,
    assistant,
    full;

    /**method: enumMethod()
     * method getting random role from 3 roles: Associate, Assistant and Full (for Full Professor)
     * @return Role
     */
    public static Role enumMethod() {

        int lower = 1;
        int upper = 3;
        int random = lower + (int)(Math.random() * ((upper - lower) + 1));

        return switch (random) {
            case 1 -> Role.assistant;
            case 2 -> Role.associate;
            case 3 -> Role.full;
            default -> null;
        };
    }

}
