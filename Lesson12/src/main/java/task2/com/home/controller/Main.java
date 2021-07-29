package task2.com.home.controller;

import task1.com.home.utils.Printer;
import task2.com.home.exceptions.WrongLoginException;
import task2.com.home.exceptions.WrongPasswordException;
import task2.com.home.model.Authorization;

import java.util.Scanner;

import static task2.com.home.model.Authorization.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String login, password, confirmPassword;
        boolean isOkay;

        Printer.print("Введите логин:");
        login = scanner.nextLine();
        Printer.print("Введите пароль:");
        password = scanner.nextLine();
        Printer.print("Повторите пароль:");
        confirmPassword = scanner.nextLine();
        isOkay = checkAuthorization(login, password, confirmPassword);
        Printer.print("Вход выполнен? " + isOkay);
    }
}
