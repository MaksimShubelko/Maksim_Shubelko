package task4.com.home.utils;

import task4.com.home.model.Car;

import java.io.IOException;

public interface IDeserializable {
    Car deserialize(Car car) throws IOException, ClassNotFoundException;
}
