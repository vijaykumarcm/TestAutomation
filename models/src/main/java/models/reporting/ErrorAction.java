package models.reporting;

public enum ErrorAction {
	IGNORE,
    NEXTTESTSTEP,
    NEXTITERATION,
    NEXTTESTCASE,
    ENDTEST,
    RECOVER,
    ENDCOMPONENT;

    /**
     * Converts a string to an ErrorAction enum.
     *
     * @param value The string to convert
     * @return The ErrorAction enum
     */
    public static ErrorAction get(String value) {

        if (value == null) {
            return NEXTTESTSTEP;
        }

        switch (value.toLowerCase().replace(" ", "")) {
            case "ignore":
                return IGNORE;
            case "nexttestcase":
                return NEXTTESTCASE;
            case "":
            case "nextstep":
            case "nextteststep":
                return NEXTTESTSTEP;
            case "nextiteration":
                return NEXTITERATION;
            case "endcomponent":
                return ENDCOMPONENT;
            case "endtest":
                return ENDTEST;
            default:
                return RECOVER;
        }
    }

    /**
     * Converts an integer to an ErrorAction enum.
     *
     * @param value The int to convert
     * @return The ErrorAction enum
     */
    public static ErrorAction get(int value) {
        switch (value) {
            case 0:
                return IGNORE;
            default:
            case 1:
                return NEXTTESTSTEP;
            case 2:
                return NEXTITERATION;
            case 3:
                return NEXTTESTCASE;
            case 4:
                return ENDTEST;
            case 5:
                return ENDCOMPONENT;
            case 6:
                return RECOVER;
        }
    }

    /**
     * Converts an ErrorAction to an integer enum.
     *
     * @param value The ErrorAction enum
     * @return The int
     */
    public static int get(ErrorAction value) {
        switch (value) {
            case IGNORE:
                return 0;
            default:
            case NEXTTESTSTEP:
                return 1;
            case NEXTITERATION:
                return 2;
            case NEXTTESTCASE:
                return 3;
            case ENDTEST:
                return 4;
            case ENDCOMPONENT:
                return 5;
            case RECOVER:
                return 6;
        }
    }

}
