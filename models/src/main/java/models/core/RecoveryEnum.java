package models.core;

public enum RecoveryEnum {
    BEGIN(0),
    BACK(1),
    REPEAT(2),
    NEXT(3);

    private int value;
    private int count;

    RecoveryEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return count;
    }

    public void setValue(int value) {
        this.count = value;
    }

    /**
     * Gets a recovery enum from a string.
     *
     * @param value The value
     * @return The enum
     */
    public static RecoveryEnum get(String value) {
        switch (value.toLowerCase()) {
            case "begin":
                return BEGIN;
            case "back":
                return BACK;
            case "repeat":
                return REPEAT;
            case "next":
                return NEXT;
            default:
                throw new RuntimeException(String.format("Invalid recovery type : %s.", value));
        }
    }

    /**
     * Converts an integer to an RecoveryEnum enum.
     *
     * @param value The int to convert
     * @return The RecoveryEnum enum
     */
    public static RecoveryEnum get(int value) {
        switch (value) {
            case 0:
                return BEGIN;
            case 1:
                return BACK;
            case 2:
                return REPEAT;
            default:
            case 3:
                return NEXT;
        }
    }
}
