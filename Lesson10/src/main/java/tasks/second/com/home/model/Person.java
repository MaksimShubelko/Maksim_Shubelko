package tasks.second.com.home.model;

import lombok.ToString;
import tasks.second.com.home.clothes.IClothes;

import java.util.ArrayList;

@ToString
public class Person {
    private final ArrayList<IClothes> clothes = new ArrayList<>();

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
}
