package projectpart1;
/**
 * Exception thrown when an invalid name is provided for a person.
 */
public class InvalidNameException extends RuntimeException{
    /**
     * Constructs a new InvalidNameException with a default error message.
     */
    InvalidNameException(){
        super("Invalid Person Name ,Please Try again ");
    }
}
