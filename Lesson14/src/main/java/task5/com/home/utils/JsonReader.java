package task5.com.home.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import task5.com.home.model.Car;

import java.io.File;
import java.io.IOException;

public abstract class JsonReader {
    public static Car readJson() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File(FilesPaths.FILE_JSON_PATH.getPath());

        return mapper.readValue(file, Car.class);
    }
}
