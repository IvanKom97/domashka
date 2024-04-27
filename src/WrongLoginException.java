public class WrongLoginException extends RuntimeException {
    private String param;

    public WrongLoginException(String message, String param) {
        super(message + param);
        this.param = param;
    }

    public String getParam() {
        return this.param;
    }
    public WrongLoginException() {
        super("Cannot");
    }
}
