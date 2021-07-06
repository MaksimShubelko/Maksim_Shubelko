package com.home.model;

public class Address {
    private String country;
    private String city;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
