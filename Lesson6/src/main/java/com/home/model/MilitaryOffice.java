package com.home.model;

import java.util.ArrayList;
import java.util.List;

public class MilitaryOffice {
    public final int MIN_AGE = 25;
    public final int MAX_AGE = 27;

    private List<Person> personList;
    private List<Person> fitPersonList = new ArrayList<>();

    public MilitaryOffice(List<Person> personList) {
        this.personList = PersonRegistry.getPersonList();
    }

    public void findFit() {

        for (Person person : personList) {

            int age = person.getAge();
            String sex = person.getSex();

            if (age >= 18 && age <= MAX_AGE && sex.equals(Person.MALE)) {
                this.fitPersonList.add(person);

            }
        }
    }

    public void printNameOfFitPersons() {
        System.out.println("Fit persons:");
        for (Person person : fitPersonList) {
            System.out.println(person.getName());
        }
    }

    public void calculateCountOfFitInCity(String findCity) {

        int count = 0;

        for (Person person : fitPersonList) {

            if (person.getAddress().getCity().equals(findCity)) {
                count++;
            }
        }

        System.out.println("Count of fit persons in " + findCity + " is " + count);
    }

    public void calculateCountOfFitPersonsInAgeRange() {

        int count = 0;

        for (Person person : fitPersonList) {
            int age = person.getAge();
            if (age >= MIN_AGE && age <= MAX_AGE) {
                count++;
            }
        }

        System.out.println("Count of fit persons from " + MIN_AGE + " to " + MAX_AGE + " is " + count);
    }

    public void printCountOfFitPersonsWithTheName(String findName) {

        int count = 0;

        for (Person person : fitPersonList) {
            String name = person.getName();
            if (name.equals(findName)) {
                count++;
            }
        }

        System.out.println("Count of fit persons with the name " + findName + " is " + count);

    }
}
