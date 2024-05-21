package models.exceptions;

public class SearchException extends RuntimeException {

	 public SearchException(String message) {
	        super(message);
	    }

	    public SearchException(String message, Throwable cause) {
	        super(message, cause);
	    }
}
