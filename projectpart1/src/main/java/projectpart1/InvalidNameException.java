package projectpart1;

public class InvalidNameException extends RuntimeException{
    InvalidNameException(){
        super("Invalid Person Name ,Please Try again ");
    }
}
