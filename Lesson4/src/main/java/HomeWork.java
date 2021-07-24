import java.util.*;

public class HomeWork {


    public static void main(String[] args) {
        System.out.println(divideAmoeba());
        System.out.println(summ(9, 0));
        System.out.print(printElementsOfArray());
        System.out.println(calculateCountOfDigits());
        System.out.println(createArray());
        System.out.println(findIndexOfMaxElement());
        System.out.println(changeElements());

        int[] arrayFirst = {4, 5, 0, 23, 77, 0, 8, 9, 101, 2};
        System.out.println(swapElements(arrayFirst));

        int[] arraySecond = {0, 4, 5, 0, 23, 77, 0, 77, 77, 101, 2, 7, 54, 54};
        System.out.println(findRecurringElements(arraySecond));

        System.out.println(transposition());

    }

    public static StringBuilder divideAmoeba() {

        StringBuilder result = new StringBuilder();
        for (int i = 0, j = 1; i <= 24; i += 3, j *= 2) {
            result.append("Через ").append(i).append(" часов амёб будет: ").append(j).append("\n");
        }

        return result;
    }

    public static long summ(int a, int b) {
        long result = a;

        if (a == 0 || b == 0) {
            result = 0;
        } else {
            for (int i = 1; i < Math.abs(b); i++) {
                result += a;
            }

            if (a > 0 ^ b > 0) {
                result = -Math.abs(result);
            } else {
                result = Math.abs(result);
            }

        }
        return result;
    }

    public static StringBuilder printElementsOfArray() {

        StringBuilder result = new StringBuilder();

        int[][] array = new int[4][4];

        Random random = new Random();

        result.append("\nВаш массив изначально:\n");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
                result.append(" ").append(array[i][j]);
            }
            result.append("\n");
        }

        result.append("\nТреугольники, состоящие из элементов массива:\n");
        for (int k = 0; k < array.length; k++) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {

                    if (compareElements(k, array, i, j)) {
                        result.append(" ").append(array[i][j]);
                    } else {
                        result.append("  ");
                    }
                }
                result.append("\n");
            }
            result.append("\n");
        }

        return result;
    }

    public static boolean compareElements(int typeOfTriangle, int[][] array, int firstIndex, int secondIndex) {
        boolean resultOfComparisons = false;

        switch (typeOfTriangle) {
            case 0:
                if (firstIndex + secondIndex >= array.length - 1) {
                    resultOfComparisons = true;
                }
                break;
            case 1:
                if (firstIndex >= secondIndex) {
                    resultOfComparisons = true;
                }
                break;
            case 2:
                if (firstIndex <= secondIndex) {
                    resultOfComparisons = true;
                }
                break;
            case 3:
                if (firstIndex + secondIndex <= array.length - 1) {
                    resultOfComparisons = true;
                }
        }
        return resultOfComparisons;
    }

    public static StringBuilder calculateCountOfDigits() {
        Scanner scanner = new Scanner(System.in);

        StringBuilder result = new StringBuilder();
        System.out.print("Введите число:");

        while (!scanner.hasNextInt()) {
            System.out.println("Это не число!");
            scanner.next();
        }

        int number;
        number = scanner.nextInt();

        result.append(number);

        if (number > 0) {
            result.append(" это положительное число, с количеством цифр, равным ");
        } else {
            if (number < 0) {
                result.append(" это отрицательное число, с количеством цифр, равным ");
            } else {
                result.append(" это не положительное и не отрицательное число, с количеством цифр, равным ");
            }
        }

        int countOfDigits = 0;

        for (; ; ) {
            number /= 10;
            countOfDigits++;
            if (number == 0) {
                break;
            }
        }

        result.append(countOfDigits);

        return result;
    }

    public static StringBuilder createArray() {

        StringBuilder result = new StringBuilder();

        int[] array = new int[50];

        for (int i = 0; i < 50; i++) {
            array[i] = i * 2 + 1;
        }

        result.append("\nМассив нечётных чисел: ");
        for (int j : array) {
            result.append(j).append(" ");
        }

        result.append("\nМассив нечётных чисел в обратном порядке: ");
        for (int i = array.length - 1; i >= 0; i--) {
            result.append(array[i]).append(" ");
        }
        return result;
    }

    public static StringBuilder findIndexOfMaxElement() {

        Random random = new Random();
        StringBuilder result = new StringBuilder("Ваш массив вначале: ");

        int[] array = new int[12];

        System.out.println("\n");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(16);
            result.append(array[i]).append(" ");

        }

        int max = array[0];
        for (int k : array) {
            if (k > max) {
                max = k;
            }
        }

        result.append("\nНомер по порядку последнего вхождения максимального элемента: ");
        for (int j = array.length - 1; j >= 0; j--) {
            if (array[j] == max) {
                result.append(j + 1);
                break;
            }

        }
        return result;

    }

    public static StringBuilder changeElements() {
        int[] array = new int[20];

        Random random = new Random();

        StringBuilder result = new StringBuilder();

        result.append("\nВаш массив вначале: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21);
            result.append(array[i]).append(" ");

        }

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                continue;
            }
            array[i] = 0;

        }

        result.append("\nВаш массив после манипуляции: ");
        for (int j : array) {
            result.append(j).append(" ");

        }

        return result;
    }

    public static StringBuilder swapElements(int[] array) {

        int buffer, index = 0;
        StringBuilder result = new StringBuilder("Ваш массив вначале:\n");

        if (array != null) {
            buffer = array[0];
            for (int i = 0; i < array.length; i++) {
                result.append(array[i]).append(" ");
                if (array[i] > buffer) {
                    buffer = array[i];
                    index = i;
                }
            }

            array[index] = array[0];
            array[0] = buffer;

            result.append("\nВаш массив после манипуляций:\n");
            System.out.println();
            for (int j : array) {
                result.append(j).append(" ");
            }
            return result;
        }
        return null;
    }

    public static StringBuilder findRecurringElements(int[] array) {

        if (array != null) {

            StringBuilder result = new StringBuilder("\nМассив изначально:\n");
            StringBuilder buffer = new StringBuilder();

            for (int k : array) {
                result.append(k).append(" ");
            }

            result.append("\nПовторяющиеся элементы массива: ");

            for (int i = 1; i < array.length; i++) {
                for (int j = i - 1; j >= 0; j--) {
                    if (array[i] == array[j] && !buffer.toString().contains(Integer.toString(array[i]))) {
                        buffer.append(array[i]).append(" ");
                    }
                }
            }

            result.append("\n").append(buffer);

            return result;
        }
        return null;
    }

    public static StringBuilder transposition() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int buffer;

        StringBuilder result = new StringBuilder();
        System.out.println("\nВведите размер матрицы:");

        while (!scanner.hasNextInt()) {
            System.out.println("Это не число!");
            scanner.next();
        }

        int size = scanner.nextInt();

        int[][] array = new int[size][size];

        result.append("\nВаш массив изначально:\n");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(51);
                result.append(String.format("%5d", array[i][j]));
            }
            result.append("\n");
        }


        for (int j = 0; j < array.length; j++) {
            for (int i = j + 1; i < array[j].length; i++) {
                buffer = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = buffer;

            }

        }

        result.append("\nВаш массив после транспонирования:\n");
        for (int[] ints : array) {
            for (int anInt : ints) {
                result.append(String.format("%5d", anInt));
            }

            result.append("\n");
        }
        return result;
    }
}
