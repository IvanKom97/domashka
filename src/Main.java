public class Main {
    public static void main(String[] args) {
        try {
            Service.parametrs("main1997", "babkaSergeevna_23", "babkaSergeevna_23");
        } catch (WrongLoginException wrongLoginException) {
            wrongLoginException.printStackTrace();
        } catch (WrongPasswordException wrongPasswordException) {
            wrongPasswordException.printStackTrace();
        }
    }
}