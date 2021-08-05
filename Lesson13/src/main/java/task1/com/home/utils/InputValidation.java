package task1.com.home.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class InputValidation {
    private static final Scanner scanner = new Scanner(System.in);

    public static int checkInt() {
        int enterInt = 0;

        while (enterInt < 1) {

            while (!scanner.hasNextInt()) {
                System.out.println("Это не число! ");
                scanner.next();
            }
            enterInt = scanner.nextInt();
        }

        return enterInt;
    }
}
