package task2.com.home.controller;

import task2.com.home.model.CalculatorCountOfNumbers;
import task2.com.home.utils.GeneratorNumbers;
import tasks.first.com.home.utils.InputValidation;
import tasks.first.com.home.utils.Printer;

import java.util.Set;

public class Main {

    public static void main(String[] args) {
        CalculatorCountOfNumbers calculatorCountOfNumbers = new CalculatorCountOfNumbers();
        StringBuilder result = new StringBuilder();
        int countOfEvenNumbers = calculatorCountOfNumbers.calculateCountOfEven(generatorMenu());

        result.append("Количество чётных чисел в аотоке данных равно: ")
                .append(countOfEvenNumbers);
        Printer.print(result.toString());
    }

    public static Set<Integer> generatorMenu() {
        int minNumber, maxNumber, countOfNumbers;

        Printer.print("Введите минимальное число:");
        minNumber = InputValidation.checkInt();
        Printer.print("Введите максимальное число:");
        maxNumber = InputValidation.checkInt();
        Printer.print("Введите количесвто гененрируемых чисел:");
        countOfNumbers = InputValidation.checkInt();

        return GeneratorNumbers.generateNumbers(minNumber, maxNumber, countOfNumbers);
    }
}
