package Lesson16;

/**
 * Created by Админ on 26.09.2017.
 */
public class ExceptionDemo {
    public static void main(String args[]) {


        String login = "LOGIN";
        String password = "PASSWORD";
        String confirmPassword = "CONFIRMPASSWORD";
        checkLogin(login, password, confirmPassword);


    }

    public static void checkLogin(String login, String password, String confirmPassword) {
        try {
            if (login.length() > 20) {
                throw new WrongLoginException();
            }
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println(login);
            System.out.println(password);
            System.out.println(confirmPassword);
        }
    }
}
