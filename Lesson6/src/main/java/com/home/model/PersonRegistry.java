package com.home.model;

import java.util.ArrayList;
import java.util.List;

public class PersonRegistry {
    private static List<Person> personList = new ArrayList<>();

    public static void addPerson(Person person) {
        personList.add(person);
    }

    public static List<Person> getPersonList() {
        return personList;
    }
}
