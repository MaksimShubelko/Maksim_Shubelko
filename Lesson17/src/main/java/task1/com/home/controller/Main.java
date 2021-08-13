package task1.com.home.controller;

import task1.com.home.model.MultiplierCollection;
import task1.com.home.utils.GeneratorNumbers;
import tasks.first.com.home.utils.InputValidation;
import tasks.first.com.home.utils.Printer;

import java.util.Set;

public class Main {

    public static void main(String[] args) {
        MultiplierCollection multiplierCollection = new MultiplierCollection();
        StringBuilder result = new StringBuilder();
        Set<Integer> collectionInTheBegin = generatorMenu();
        multiplierCollection.setMultipleMember(multipleMemberMenu());
        Set<Integer> collectionAfterChanges = multiplierCollection.multipleCollections(collectionInTheBegin);

        result.append("Коллекция вначале: ")
                .append(collectionInTheBegin)
                .append("Коллекция после изменения: ")
                .append(collectionAfterChanges.toString());
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

    public static int multipleMemberMenu() {
        Printer.print("Введите число, на которое следует умножить коллекцию:");
        return InputValidation.checkInt();
    }
}
