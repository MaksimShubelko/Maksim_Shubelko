package tasks.second.com.home.model;

import lombok.Setter;
import lombok.ToString;
import tasks.second.com.home.clothes.IJacket;
import tasks.second.com.home.clothes.IPants;
import tasks.second.com.home.clothes.IShoes;

@Setter
@ToString
public class Person {
    private IJacket jacket;
    private IPants pants;
    private IShoes shoes;

    public void takeOff() {
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
    }

    public void takeOn() {
        jacket.takeOn();
        pants.takeOn();
        shoes.takeOn();
    }
}
