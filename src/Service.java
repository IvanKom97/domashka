import javax.swing.plaf.SplitPaneUI;

public class Service {
    public static void parametrs(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!login.matches(Patterns.LOGIN_PATTERN.getValue()) || login.length() > 20) {
            throw new WrongLoginException("Error: "  , login);
        }if (!password.matches(Patterns.PASSWORD_PATTERN.getValue()) && password.length() > 20) {
            throw new WrongLoginException("Error: " , password);
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Error, try it again: ", confirmPassword);
        }
        }
}