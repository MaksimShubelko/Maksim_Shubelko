package tasks.first.com.home.utils;

import java.util.Scanner;

public final class InputValidation {
    private static final Scanner scanner = new Scanner(System.in);

    private InputValidation() {

    }

    public static int checkInt() {
        int enterInt = -1;

        while (enterInt < 0) {

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

    public static String checkString() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        if (string.equals("\n")) {
            return scanner.nextLine();
        }
        return string;
    }

    public static boolean checkBoolean() {
        boolean enterBoolean = true;

        while (!scanner.hasNextBoolean()) {
            System.out.println("Это не логическое значение! ");
            scanner.next();
        }
        enterBoolean = scanner.nextBoolean();


        return enterBoolean;
    }
}
