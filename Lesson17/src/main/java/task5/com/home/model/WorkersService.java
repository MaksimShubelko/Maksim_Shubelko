package task5.com.home.model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class WorkersService {
    private ArrayList<Worker> workers = new ArrayList<>();

    public void addWorker(Worker worker) {
        workers.add(worker);
    }

    public int calculateCountNamesWithFirstLetter(char firstLetterOfName) {
        return (int) workers
                .stream()
                .filter(worker -> Character.toString(worker
                        .getName()
                        .charAt(0))
                        .equals(Character.toString(firstLetterOfName)))
                .count();
    }

    public List<String> takeFirstLetters() {
        return workers
                .stream()
                .sorted((o1, o2)-> o1.getName().compareTo(o2.getName()))
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
