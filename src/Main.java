import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class Main {
    public static void main(String[] args) {
        String login = "MarcoV";
        String password = "no_place_for_silence";
        String confirmPassword = "no_place_for_silence";

        checkAll(login, password, confirmPassword);
    }

    public static void check(String login, String password, String confirmPassword) {

        if ((login.matches("\\w+")) && login.length() <= 20) {
        } else {
            throw new WrongLoginException();
        }
        if (password.matches("\\w+") && password.length() <= 20 && password.equals(confirmPassword)) {
        } else {
            throw new WrongPasswordException();
        }
    }

    public static void checkAll(String login, String password, String confirmPassword) {
        try {
            check(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            throw new WrongLoginException();
        } catch (WrongPasswordException e) {
            throw new WrongPasswordException();
        }
    }

}
