package task4.com.home.utils.service;

import task4.com.home.utils.model.Car;
import task6.com.home.service.ICreateService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService implements ICarService {
    private ArrayList<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public List<Car> getCars(int lastYearOfRealise) {
        return cars
                .stream()
                .filter(car -> !car.getCarNumber().isBlank() || car != null)
                .filter(car -> car.getYearOfRealise() >= lastYearOfRealise)
                .collect(Collectors.toList());
    }

}
