package task4.com.home.utils;

import task4.com.home.model.Car;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public abstract class Deserializator implements IDeserializable {
    public static Car deserialize() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(FilesPaths.FILE_CARS_PATH.getPath());
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        return (Car) objectInputStream.readObject();
    }
}
