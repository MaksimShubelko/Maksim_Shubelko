package task6.com.home.utils;

import java.util.Scanner;

public abstract class EmailChecker {
    public static String checkEmail(String email) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$")) {
                return email;
            } else {
                email = scanner.nextLine();
            }
        }
    }
}
