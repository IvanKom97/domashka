import javax.swing.plaf.SplitPaneUI;

public class Service {
    public static void parametrs(String login, String password, String confirmPassword) {
        if (!login.matches("[a-zA-Z1-9-0_]+") || login.length() > 20) {
            throw new WrongLoginException("Error" + " : ", login);
        }if (!password.matches("[a-zA-Z1-9_]+") && password.length() > 20) {
            throw new WrongLoginException("Error" + " : ", password);
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Error, try it again " + " : ", confirmPassword);
        }
        }
}