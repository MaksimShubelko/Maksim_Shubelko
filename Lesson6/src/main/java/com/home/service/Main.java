package com.home.service;

import com.home.model.MilitaryOffice;
import com.home.model.Person;
import com.home.model.PersonRegistry;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String enterString;
        Person person = new Person();
        int chose;

        while (true) {
            System.out.println("Enter number:\n1 -- add\n2 -- calculate\n3 -- exit");

            do {
                while (!scanner.hasNextInt()) {
                    System.out.println("It's not a number!");
                    scanner.nextInt();
                }
                chose = scanner.nextInt();

            } while (chose < 1 || chose > 2);

            switch (chose) {
                case 1:
                    while (true) {


                        System.out.println("Enter name:");
                        enterString = scanner.nextLine();

                        if (compareRegular(enterString)) {
                            person.setName(enterString);
                            break;
                        } else {
                            System.out.println("Incorrect data!");
                        }
                    }

                    while (true) {
                        System.out.println("Enter country:");
                        enterString = scanner.nextLine();

                        if (compareRegular(enterString)) {
                            person.setName(enterString);
                            break;
                        } else {
                            System.out.println("Incorrect data!");
                        }
                    }

                    while (true) {

                        System.out.println("Enter city:");
                        enterString = scanner.nextLine();

                        if (compareRegular(enterString)) {
                            person.setName(enterString);
                            break;
                        } else {
                            System.out.println("Incorrect data!");
                        }
                    }

                    System.out.println("Enter age:");
                    int enterInt;

                    do {
                        while (!scanner.hasNextInt()) {
                            System.out.println("It's not a number!");
                            scanner.nextInt();
                        }
                        enterInt = scanner.nextInt();

                    } while (enterInt < 0 || enterInt > 130);
                    PersonRegistry.addPerson(person);

                    break;
                case 2:
                    MilitaryOffice.findFit(PersonRegistry.getPersonList());

                    MilitaryOffice.calculateCountOfFitInMinsk();
                    MilitaryOffice.calculateCountOfFitPersonsInAgeRange();
                    MilitaryOffice.printCountOfFitPersonsWithTheName();
                    MilitaryOffice.printNameOfFitPersons();
                case 3:
                    return;
                default:
                    throw new IllegalStateException("Unexpected value: " + chose);
            }


        }
    }

    public static boolean compareRegular(String string) {
        boolean resultOfCompare = false;

        Pattern patOnlyLatin = Pattern.compile("^[A-Z][-a-z]+$");
        Matcher matOnlyLatin = patOnlyLatin.matcher(string);

        if (matOnlyLatin.matches()) {
            resultOfCompare = true;
        }

        return resultOfCompare;
    }
}
