package task4.com.home.utils.service;

import task4.com.home.utils.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    private ArrayList<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public List<Car> getCars(int lastYearOfRealise) {
        return cars
                .stream()
                .filter(car -> car.getCarNumber() != null)
                .filter(car -> !car.getCarNumber().isBlank())
                .filter(car -> car.getYearOfRealise() >= lastYearOfRealise)
                .collect(Collectors.toList());
    }

}
