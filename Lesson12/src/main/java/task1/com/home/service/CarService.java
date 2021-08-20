package task1.com.home.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import task1.com.home.exceptions.CarCantStart;
import task2.com.home.model.Car;
import task2.com.home.model.ICar;
import task2.com.home.utils.CarMessages;

import java.util.ArrayList;
import java.util.Random;

@AllArgsConstructor
@NoArgsConstructor
public class CarService implements ICar {
    private ArrayList<Car> cars = new ArrayList<>();

    @Override
    public boolean start() {
        Random random = new Random();

        return random.nextInt(21) % 2 != 0;
    }

    public String tryStart() throws CarCantStart {
        StringBuilder stringBuilder = new StringBuilder();

        for (Car car : cars) {
            if (start()) {
                stringBuilder
                        .append(CarMessages.startOkay.getMessage())
                        .append(" (марка:")
                        .append(car.getCarModel())
                        .append(")\n");
            } else {
                throw new CarCantStart(CarMessages.startError.getMessage());
            }
        }

        return stringBuilder.toString();
    }

    public void setCars(Car car) {
        this.cars.add(car);
    }
}
