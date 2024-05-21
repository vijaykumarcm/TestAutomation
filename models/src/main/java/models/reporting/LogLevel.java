package models.reporting;

public enum LogLevel {
    FATAL(6),
    DEBUG(5),
    ERROR(4),
    WARN(3),
    INFO(2),
    TRACE(1),
    OFF(7);

    private int Value;

    LogLevel(int value) {
        this.Value = value;
    }

    public int getValue() {
        return this.Value;
    }

    /**
     * Gets the log level from an integer.
     *
     * @param level The integer
     * @return The log level
     */
    public static LogLevel valueOf(int level) {
        switch (level) {
            case 7:
                return OFF;
            case 1:
            default:
                return TRACE;
            case 2:
                return INFO;
            case 3:
                return WARN;
            case 4:
                return ERROR;
            case 5:
                return DEBUG;
            case 6:
                return FATAL;
        }
    }
}
