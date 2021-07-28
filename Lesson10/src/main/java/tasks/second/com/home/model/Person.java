package tasks.second.com.home.model;

import lombok.ToString;
import tasks.second.com.home.clothes.IClothes;

import java.util.HashSet;
import java.util.Objects;

@ToString
public class Person {
    private HashSet<IClothes> clothes = new HashSet<>();

    public void takeOff() {
        for (IClothes clothes : clothes) {
            clothes.takeOff();
        }
    }

    public void takeOn() {
        for (IClothes clothes : clothes) {
            clothes.takeOn();
        }
    }

    public void setClothes(IClothes clothes) {
        this.clothes.add(clothes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(clothes, person.clothes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clothes);
    }
}
