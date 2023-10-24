package org.example;

public enum Role {

    Associate,
    Assistant,
    Full;

    /**method: enumMethod()
     * method getting random role from 3 roles: Associate, Assistant and Full (for Full Professor)
     * @return Role
     */
    public static Role enumMethod() {

        int lower = 1;
        int upper = 3;
        int random = lower + (int)(Math.random() * ((upper - lower) + 1));

        return switch (random) {
            case 1 -> Role.Assistant;
            case 2 -> Role.Associate;
            case 3 -> Role.Full;
            default -> null;
        };
    }

}
