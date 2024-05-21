package models.controls;

import com.fasterxml.jackson.annotation.JsonValue;

public enum LocatorType {
    NAME(0),
    ID(1),
    CLASS(2),
    XPATH(3),
    CSS(4),
    TESTID(5),
    TEXT(6),
    DYNAMIC(7);

    private int type;

    LocatorType(int type) {
        this.type = type;
    }

    @JsonValue()
    public int getType() {
        return this.type;
    }

    /**
     * Converts a string to a LocatorType enum.
     *
     * @param value The string to convert
     * @return The LocatorType enum
     */
    public static LocatorType get(String value) {

        if (value == null) {
            throw new RuntimeException("Locator type was null.");
        }

        switch (value.toLowerCase()) {
            case "name":
                return LocatorType.NAME;
            case "id":
                return LocatorType.ID;
            case "class":
                return LocatorType.CLASS;
            case "xpath":
                return LocatorType.XPATH;
            case "css":
                return LocatorType.CSS;
            case "testid":
                return LocatorType.TESTID;
            case "text":
                return LocatorType.TEXT;
            case "dynamic":
                return LocatorType.DYNAMIC;
            default:
                throw new RuntimeException(String.format("Invalid locator type : %s", value));
        }
    }

    /**
     * Converts an integer to a LocatorType enum.
     *
     * @param value The int to convert
     * @return The LocatorType enum
     */
    public static LocatorType get(int value) {
        switch (value) {
            case 0:
                return LocatorType.NAME;
            case 1:
                return LocatorType.ID;
            case 2:
                return LocatorType.CLASS;
            case 3:
                return LocatorType.XPATH;
            case 4:
                return LocatorType.CSS;
            case 5:
                return LocatorType.TESTID;
            case 6:
                return LocatorType.TEXT;
            default:
                throw new RuntimeException(String.format("Invalid locator type : %d", value));
        }
    }
}
