package task4.com.home.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FilesPaths {
    FILE_CARS_PATH
            ("D:\\Java_projects\\Maksim_Shubelko\\Maxim_Shubelko\\Lesson14\\src\\main\\java\\task4\\com\\home\\Cars.bin");

    private final String path;
}
