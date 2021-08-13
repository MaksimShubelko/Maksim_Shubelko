package task1.com.home.utils;

import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class GeneratorNumbers {

    public static Set<Integer> generateNumbers(int minNumb, int maxNumb, int countOfNumbers) {
        return new Random()
                .ints(countOfNumbers, minNumb, maxNumb + 1)
                .boxed()
                .collect(Collectors.toSet());
    }
}
