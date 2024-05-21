package models.exceptions;

public class ActionInstantiationException extends RuntimeException {

    public ActionInstantiationException(String message) {
        super(message);
    }

    public ActionInstantiationException(String message, Throwable cause) {
        super(message, cause);
    }
}
