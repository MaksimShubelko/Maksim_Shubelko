package task6.com.home.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public abstract class FileUtils {
    public static FileInputStream fileReadProperty() throws FileNotFoundException {

        return new FileInputStream(Constants.filePropertyPath);
    }
}
