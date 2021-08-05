package task4.com.home.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import task4.com.home.utils.Serializator;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Car implements Serializable {
    private String carModel;
    private double maxSpeed;
    private double price;
    private final Engine engine;
    private FuelTank fuelTank;


    public Car(Engine engine, FuelTank fuelTank) {
        this.engine = engine;
        this.fuelTank = fuelTank;
    }
}
