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

                    System.out.println("Enter name:");
                    person.setName(enterString());

                    System.out.println("Enter county:");
                    enterCountry = enterString();

                    System.out.println("Enter city:");
                    enterCity = enterString();

                    Address address = new Address(enterCity, enterCountry);
                    person.setAddress(address);

                    System.out.println("Enter sex:");
                    person.setSex(enterString());

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
                    militaryOffice.calculateCountOfFitPersonsInAgeRange();

                    System.out.println("Enter name for finding");
                    militaryOffice.printCountOfFitPersonsWithTheName(enterString());

                    System.out.println("Enter city for finding");
                    militaryOffice.calculateCountOfFitInCity(enterString());

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

    public static String enterString() {
        Scanner scanner = new Scanner(System.in);
        String string;

        while (true) {
            string = scanner.nextLine();

            if (compareRegular(string)) {
                return string;
            } else {
                System.out.println("Incorrect data!");
            }
        }

    }
}
