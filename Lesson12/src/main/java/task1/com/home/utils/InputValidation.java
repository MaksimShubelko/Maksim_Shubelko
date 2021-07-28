package task1.com.home.utils;

import java.util.Scanner;

public final class InputValidation {
    private static final Scanner scanner = new Scanner(System.in);

    private InputValidation() {

    }

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

    public static double checkDouble() {
        double enterDouble = -1;

        while (enterDouble < 0) {

            while (!scanner.hasNextDouble()) {
                System.out.println("Это не число! ");
                scanner.next();
            }
            enterDouble = scanner.nextDouble();
        }

        return enterDouble;
    }
}
