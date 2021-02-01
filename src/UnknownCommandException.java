package src;


public class UnknownCommandException extends Exception { 
    public UnknownCommandException(String errorMessage) {
        super(errorMessage);
    }
}