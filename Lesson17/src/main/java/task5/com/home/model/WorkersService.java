package task5.com.home.model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

@Getter
public class WorkersService {
    private List<Worker> workers;

    public void addWorker(Worker worker) {
        workers.add(worker);
    }

    public Optional<String> calculateCountNamesWithFirstLetter(char firstLetterOfName) {
        Optional<String> result = Optional.of();
        return result
                .stream()
                .filter(workers -> Character.toString(workers
                        .getName()
                        .charAt(0))
                        .equals(Character.toString(firstLetterOfName)))
                .isEmpty(new String("Нет значений"));

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
