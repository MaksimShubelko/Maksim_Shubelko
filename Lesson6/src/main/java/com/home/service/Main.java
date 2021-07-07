package com.home.service;

import com.home.model.Address;
import com.home.model.MilitaryOffice;
import com.home.model.Person;
import com.home.model.PersonRegistry;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String enterCountry;
        String enterCity;
        String enterName;
        String enterSex;

        int chose;

        while (true) {
            System.out.print("Enter number:\n1 -- add\n2 -- calculate\n3 -- exit");

            do {
                while (!scanner.hasNextInt()) {
                    System.out.println("It's not a number!");
                    scanner.next();
                }
                chose = scanner.nextInt();

            } while (chose < 1 || chose > 3);

            switch (chose) {
                case 1:
                    Person person = new Person();
                    while (true) {

                        System.out.println("Enter name:");
                        enterName = scanner.next();

                        if (compareRegular(enterName)) {
                            person.setName(enterName);
                            break;
                        } else {
                            System.out.println("Incorrect data!");
                        }
                    }

                    while (true) {
                        System.out.println("Enter country:");
                        enterCountry = scanner.next();

                        if (compareRegular(enterCountry)) {
                            break;
                        } else {
                            System.out.println("Incorrect data!");
                        }
                    }

                    while (true) {

                        System.out.println("Enter city:");
                        enterCity = scanner.next();

                        if (compareRegular(enterCity)) {
                            Address address = new Address(enterCity, enterCountry);
                            person.setAddress(address);
                            break;
                        } else {
                            System.out.println("Incorrect data!");
                        }
                    }

                    while (true) {

                        System.out.println("Enter sex:");
                        enterSex = scanner.next();

                        if (compareRegular(enterSex)) {
                            person.setSex(enterSex);
                            break;
                        } else {
                            System.out.println("Incorrect data!");
                        }
                    }


                    System.out.println("Enter age:");
                    int enterAge;

                    do {
                        while (!scanner.hasNextInt()) {
                            System.out.println("It's not a number!");
                            scanner.nextInt();
                        }
                        enterAge = scanner.nextInt();

                    } while (enterAge < 0 || enterAge > 130);
                    person.setAge(enterAge);
                    PersonRegistry.addPerson(person);

                    break;
                case 2:
                    MilitaryOffice militaryOffice = new MilitaryOffice(PersonRegistry.getPersonList());
                    militaryOffice.findFit();
                    militaryOffice.printNameOfFitPersons();
                    militaryOffice.calculateCountOfFitInMinsk();
                    militaryOffice.calculateCountOfFitPersonsInAgeRange();
                    militaryOffice.printCountOfFitPersonsWithTheName();
                    break;
                case 3:
                    return;
                default:
                    throw new IllegalStateException("Unexpected value: " + chose);
            }
        }
    }

    public static boolean compareRegular(String string) {
        boolean resultOfCompare = true;

        Pattern patOnlyLatin;
        patOnlyLatin = Pattern.compile("^[A-Z][-a-z]+$");
        Matcher matOnlyLatin = patOnlyLatin.matcher(string);

        if (!matOnlyLatin.matches()) {
            resultOfCompare = false;
        }

        return resultOfCompare;
    }
}
