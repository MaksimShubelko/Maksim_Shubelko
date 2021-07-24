package com.home.utils;

import java.util.Scanner;

public class InputValidation {


    private InputValidation() {
    }

    public static int checkInt() {
        Scanner scanner = new Scanner(System.in);

        int enterInt;

        while (!scanner.hasNextInt()) {
            System.out.println("Это не число! ");
            scanner.next();
        }
        enterInt = scanner.nextInt();

        return enterInt;
    }

    public static double checkDouble() {
        Scanner scanner = new Scanner(System.in);

        double enterDouble;

        while (!scanner.hasNextDouble()) {
            System.out.println("Это не число! ");
            scanner.next();
        }
        enterDouble = scanner.nextDouble();

        return enterDouble;
    }

    public static boolean checkBoolean() {
        Scanner scanner = new Scanner(System.in);

        boolean enterBoolean;

        while (!scanner.hasNextBoolean()) {
            System.out.println("Это не логическое значение! ");
            scanner.next();
        }
        enterBoolean = scanner.nextBoolean();

        return enterBoolean;
    }


}
