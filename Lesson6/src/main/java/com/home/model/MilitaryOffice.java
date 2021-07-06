package com.home.model;

import java.util.ArrayList;
import java.util.List;

public class MilitaryOffice {
    public static final String COUNTRY = "Minsk";
    public static final int MIN_AGE = 25;
    public static final int MAX_AGE = 27;
    public static final String NAME = "Alexander";

    static List<Person> personList = new ArrayList<>();
    static List<Person> fitPersonList = new ArrayList<>();

    public MilitaryOffice(List<Person> personList) {
        MilitaryOffice.personList = PersonRegistry.personList;
    }

    public static void findFit(List<Person> personList) {
        for (Person person : personList) {

            int age = person.getAge();
            String sex = person.getSex();

            if (age >= 18 && age <= 27 && sex.equals("MALE")) {
                fitPersonList.add(person);
            }
        }
    }

    public static void printNameOfFitPersons() {
        for (Person person : fitPersonList) {
            System.out.println(person.getName());
        }
    }

    public static void calculateCountOfFitInMinsk() {

        int count = 0;

        for (Person person : fitPersonList) {
            if (person.getAddress().getCity().equals(COUNTRY)) {
                count++;
            }
        }

        System.out.println("Count of fit persons in " + COUNTRY + " is " + count);
    }

    public static void calculateCountOfFitPersonsInAgeRange() {

        int count = 0;

        for (Person person : fitPersonList) {
            int age = person.getAge();
            if (age >= MIN_AGE && age <= MAX_AGE) {
                count++;
            }
        }

        System.out.println("Count of fit persons from " + MIN_AGE + " to " + MAX_AGE + " is " + count);
    }

    public static void printCountOfFitPersonsWithTheName() {
        int count = 0;

        for (Person person : fitPersonList) {
            String name = person.getName();
            if (name.equals(NAME)) {
                count++;
            }
        }

        System.out.println("Count of fit persons with the name " + NAME + " is " + count);

    }


}
