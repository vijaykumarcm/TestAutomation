package models.database;

public enum ExecutionStatusEnum {

    NOTRUN(1),
    RUNNING(2),
    COMPLETED(3);

    private int value;

    ExecutionStatusEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    /**
     * Gets the execution status enum from the int.
     *
     * @param value The int value
     * @return The enum value
     */
    public static ExecutionStatusEnum get(int value) {
        switch (value) {
            case 1:
                return NOTRUN;
            case 2:
                return RUNNING;
            case 3:
                return COMPLETED;
            default:
                throw new RuntimeException(String.format("Invalid execution status value : %s.", value));
        }
    }
}
