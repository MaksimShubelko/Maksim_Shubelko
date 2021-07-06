package com.home.model;

public class Person {
    public static final String MALE = "male";
    public static final String FEMALE = "female";

    private Address address;
    private String name;
    private String sex = FEMALE;
    private int age;

    public Person() {

    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        if (MALE.equals(sex) || FEMALE.equals(sex)) {
            this.sex = sex;
        }
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 130) {
            this.age = age;
        }
    }

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "address=" + address +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
