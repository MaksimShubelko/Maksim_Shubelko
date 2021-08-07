package task2.com.home.utils;

import lombok.Getter;

@Getter
public enum FilesPaths {
    FILE_IN_PATH
            ("D:\\Java_projects\\Maksim_Shubelko\\Maxim_Shubelko\\TMS\\Lesson14\\src\\main\\java\\hw2\\input.txt"),
    FILE_OUT_PATH
            ("D:\\Java_projects\\Maksim_Shubelko\\Maxim_Shubelko\\Lesson14\\src\\main\\java\\task2\\com\\home\\fileOut.txt");

    private String path;

    FilesPaths(String path) {
        this.path = path;
    }
}
