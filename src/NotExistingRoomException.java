package src;

public class NotExistingRoomException extends Exception {
  private static final long serialVersionUID = 1L;

  public NotExistingRoomException(String message) {
    super(message);
  }
}
