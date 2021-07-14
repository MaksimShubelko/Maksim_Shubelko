package com.home.utils;

import java.util.Scanner;

public class InputValidation {


    public InputValidation() {
    }

    public int checkInt() {
        Scanner scanner = new Scanner(System.in);

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

    public double checkDouble() {
        Scanner scanner = new Scanner(System.in);

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

    public boolean checkBoolean() {
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
