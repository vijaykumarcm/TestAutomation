package models.exceptions;

public class ActionBuildException extends RuntimeException {
	public ActionBuildException(String message) {
        super(message);
    }

    public ActionBuildException(String message, Throwable cause) {
        super(message, cause);
    }

}
