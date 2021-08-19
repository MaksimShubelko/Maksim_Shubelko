package task2.com.home.model;

import task6.com.home.service.ICreateService;

import java.util.Set;

public class CalculatorCountOfNumbers implements ICalculatorCountOfNumbers {

    public int calculateCountOfEven(Set<Integer> numbers) {
        return (int) numbers
                .stream()
                .filter(number -> number % 2 == 0).count();
    }
}
