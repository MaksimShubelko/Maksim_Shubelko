package task3.com.home.model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class NameService {
    private ArrayList<String> names = new ArrayList<>();

    public void addName(String name) {
        names.add(name);
    }

    public List<String> riseFirstLetterToUpper() {
        return names
                .stream()
                .filter(name -> name.matches("[a-z]{2,}"))
                .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1))
                .collect(Collectors.toList());

    }
}
