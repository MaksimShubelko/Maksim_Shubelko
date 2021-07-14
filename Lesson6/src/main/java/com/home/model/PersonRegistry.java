package com.home.model;

import java.util.ArrayList;
import java.util.List;

public class PersonRegistry {
    private List<Person> personList = new ArrayList<>();

    public void addPerson(Person person) {
        personList.add(person);
    }

    public List<Person> getPersonList() {
        return personList;
    }
}
