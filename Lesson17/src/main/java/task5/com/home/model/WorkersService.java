package task5.com.home.model;

import lombok.Getter;

import java.util.*;
import java.util.stream.Collectors;

@Getter
public class WorkersService {
    private final ArrayList<Worker> workers = new ArrayList<>();

    public void addWorker(Worker worker) {
        workers.add(worker);
    }

    public Optional<String> findNamesWithFirstLetter(String firstLetterOfName) {
        return workers
                .stream()
                .filter(Objects::nonNull)
                .map(Worker::getName)
                .filter(name -> name.startsWith(firstLetterOfName))
                .reduce((a,b) -> a + ", " + b);
    }

    public List<String> takeFirstLetters() {
        return workers
                .stream()
                .sorted(Comparator.comparing(Worker::getName))
                .map(worker -> Character.toString(worker.getName().charAt(0)))
                .collect(Collectors.toList());
    }

    public List<String> makeDistinctFirstLetters(List<String> listOfFirstLetters) {
        return listOfFirstLetters
                .stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public String makeTotalResult() {
        List<String> firstLetters = takeFirstLetters();
        StringBuilder result = new StringBuilder();
        makeDistinctFirstLetters(firstLetters)
                .forEach(distinctFirstLetter -> result
                        .append(distinctFirstLetter)
                        .append(" - ")
                        .append(calculateCountOfLetters(firstLetters, distinctFirstLetter))
                        .append(" работников\n"));
        return result.toString();

    }

    public int calculateCountOfLetters(List<String> firstLetters, String letter) {
        return firstLetters.lastIndexOf(letter) - firstLetters.indexOf(letter) + 1;
    }
}
