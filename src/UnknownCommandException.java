package src;

public class UnknownCommandException extends Exception {
  private static final long serialVersionUID = 1L;

  public UnknownCommandException(String errorMessage) {
    super(errorMessage);
  }
}