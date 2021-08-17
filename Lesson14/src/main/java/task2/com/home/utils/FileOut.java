package task2.com.home.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public abstract class FileOut implements IFileIn {

    public static void fileOut(List<String> lines, String path) {

        try {
            Files.write(Paths.get(path), lines, StandardOpenOption.CREATE);
        } catch (Exception e) {
            Printer.print(e.getMessage());
        }
    }
}
