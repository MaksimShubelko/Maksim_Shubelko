package task2.com.home.model;

import java.util.Set;

public class CalculatorCountOfNumbers {

    public int calculateCountOfEven(Set<Integer> numbers) {
        return (int) numbers
                .stream()
                .filter(number -> number % 2 == 0).count();
    }
}
