public class WrongPasswordException extends RuntimeException {
    private String param;

    public WrongPasswordException(String message, String param) {
        super(message + param);
        this.param = param;
    }
}
