package task5.com.home.model;

import lombok.Getter;
import tasks.first.com.home.utils.Printer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Getter
public class WorkersService {
    private ArrayList<Worker> workers = new ArrayList<>();

    public void addWorker(Worker worker) {
        workers.add(worker);
    }

    public Optional<String> calculateCountNamesWithFirstLetter(String firstLetterOfName) {
        Optional<String> result = Optional.of(workers
                .stream()
                .filter(Objects::nonNull)
                .map(Worker::getName)
                .filter(name -> name.startsWith(firstLetterOfName))
                .collect(Collectors.joining(", ")));
        return result;
    }

    public List<String> takeFirstLetters() {
        return workers
                .stream()
                .sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
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
                .stream()
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
