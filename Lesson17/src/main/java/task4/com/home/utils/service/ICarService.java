package task4.com.home.utils.service;

import task4.com.home.utils.model.Car;

import java.util.List;

public interface ICarService {
    void addCar(Car car);

    List<Car> getCars(int lastYearOfRealise);
}
