package task2.com.home.model;

import task1.com.home.utils.Printer;
import task2.com.home.utils.AuthorizationMessages;
import task2.com.home.exceptions.WrongLoginException;
import task2.com.home.exceptions.WrongPasswordException;

public abstract class Authorization implements IAuthorization {

    public static boolean checkAuthorization(String login, String password, String confirmPassword) {

        String passLoginFormat = DataFormat.PasswordLoginFormat.getDataFormat();
        boolean isOkay = false;
        String wrongLoginMessage = AuthorizationMessages.WrongLoginMessage.getMessage();
        String wrongPasswordMessage = AuthorizationMessages.WrongPasswordMessage.getMessage();
        try {
            if (!login.matches(passLoginFormat)) {
                throw new WrongLoginException(wrongLoginMessage);
            } else if (!password.matches(passLoginFormat) || !password.equals(confirmPassword)) {
                throw new WrongPasswordException(wrongPasswordMessage);
            } else {
                isOkay = true;
            }
        } catch (Exception exception) {
            Printer.print(exception.getMessage());
        }
        return isOkay;
    }
}
