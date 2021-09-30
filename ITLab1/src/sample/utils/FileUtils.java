package sample.utils;

import com.sun.javafx.geom.AreaOp;
import com.sun.source.util.SourcePositions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public abstract class FileUtils {
  public static final String path =
      "D:\\Java_projects\\Maksim_Shubelko\\Maxim_Shubelko\\ITLab1\\src\\sample\\table.txt";

  public static List<List<String>> fileIn() throws IOException {
    Path path1 = Paths.get(path);
    List<List<String>> table = new ArrayList<>();

    List<String> tableData = Files.readAllLines(path1);
    tableData.stream()
            .map(str -> Arrays.asList(str.split("-")))
            .forEach(table::add);

    return table;
  }
}
