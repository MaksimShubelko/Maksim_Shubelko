package task4.com.home.utils;

import task4.com.home.model.Car;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public abstract class Serializator implements ISerializable {

    public static void serialize(Car car) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(FilesPaths.FILE_CARS_PATH.getPath());
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(car);
        objectOutputStream.close();
    }

}
