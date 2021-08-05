package task3.com.home.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FilesPaths {
    FILE_TEXT_PATH
            ("D:\\Java_projects\\Maksim_Shubelko\\Maxim_Shubelko\\Lesson14\\src\\main\\java\\task3\\com\\home\\text.txt"),
    FILE_CENSORSHIP_PATH
            ("D:\\Java_projects\\Maksim_Shubelko\\Maxim_Shubelko\\Lesson14\\src\\main\\java\\task3\\com\\home\\censorship.txt");

    private String path;
}
