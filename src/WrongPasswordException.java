public class WrongPasswordException extends RuntimeException {
    private String param;

    public WrongPasswordException(String message, String param) {
        super(message);
        this.param = param;
    }
}
