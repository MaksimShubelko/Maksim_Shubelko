import java.util.*;

public class Homework {


    public static void main(String[] args) {
        System.out.println(divideAmoeba());
        System.out.println(summ(9, 0));
        System.out.println(printElementsOfArray());
        System.out.println(calculateCountOfDigits());
        System.out.println(createArray());
        System.out.println(findIndexOfMaxElement());
        System.out.println(changeElements());

        int[] arrayFirst = {4, 5, 0, 23, 77, 0, 8, 9, 101, 2};
        System.out.println(swapElements(arrayFirst));

        int[] arraySecond = {0, 4, 5, 0, 23, 77, 0, 77, 77, 101, 2, 7, 54, 54};
        System.out.println(findRecurringElements(arraySecond));

    }


    //        Задачи:
//         1) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//   сколько амеб будет через 3, 6, 9, 12,..., 24 часа
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

        result.append("\nВаш массив изначально:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
                result.append(" ").append(array[i][j]);
            }
            result.append("\n");
        }

        result.append("\nТреугольники, состоящие из элементов массива:\n");
        for (int k = 0; k < 4; k++) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {

                    boolean resultOfComparisons = false;

                    switch (k) {
                        case 0:
                            if (i + j >= array.length - 1) {
                                resultOfComparisons = true;
                            }
                            break;
                        case 1:
                            if (i >= j) {
                                resultOfComparisons = true;
                            }
                            break;
                        case 2:
                            if (i <= j) {
                                resultOfComparisons = true;
                            }
                            break;
                        case 3:
                            if (i + j <= array.length - 1) {
                                resultOfComparisons = true;
                            }
                    }

                    if (resultOfComparisons) {
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

    public static StringBuilder calculateCountOfDigits() {
        Scanner scanner = new Scanner(System.in);

        StringBuilder result = new StringBuilder();
        System.out.println("Введите число:");

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
            countOfDigits += 1;
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
            result.append(j).append(", ");
        }

        result.append("\nМассив нечётных чисел в обратном порядке: ");
        for (int i = array.length - 1; i >= 0; i--) {
            result.append(array[i]).append(", ");
        }
        return result;
    }

    public static StringBuilder findIndexOfMaxElement() {

        Random random = new Random();
        StringBuilder result = new StringBuilder();

        int[] array = new int[12];

        System.out.println("\n");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(16);
            result.append(array[i]).append(", ");

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
            result.append(array[i]).append(", ");

        }

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                continue;
            }
            array[i] = 0;

        }

        result.append("\nВаш массив после манипуляции: ");
        for (int j : array) {
            result.append(j).append(", ");

        }

        return result;
    }

    public static StringBuilder swapElements(int[] array) {

        int buffer, index = 0;
        StringBuilder result = new StringBuilder("Ваш массив вначале:\n");

        if (array != null) {
            buffer = array[0];
            for (int i = 0; i < array.length; i++) {
                result.append(array[i]).append(", ");
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
                result.append(j).append(", ");
            }
            return result;
        }
        return null;
    }

    public static StringBuilder findRecurringElements(int[] array) {

        StringBuilder result = new StringBuilder("Повторяющиеся элементы массива: ");

        if (array != null) {
            for (int i = 1; i < array.length; i++) {
                for (int j = i - 1; j >= 0; j--) {
                    if (array[i] == array[j] && !result.toString().contains(Integer.toString(array[i]))) {
                        result.append(array[i]).append(" ");
                    }
                }
            }
            return result;
        }
        return null;
    }

    public static StringBuilder transposition() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int buffer;

        StringBuilder result = new StringBuilder();
        System.out.println("Введите размер матрицы:");

        while (!scanner.hasNextInt()) {
            System.out.println("Это не число!");
            scanner.next();
        }

        int size = scanner.nextInt();

        int[][] array = new int[size][size];

        result.append("\nВаш массив изначально:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(51);
                result.append(" ").append(array[i][j]);
            }
            result.append("\n");
        }

        result.append("\nВаш массив после транспонирования:");
        for (int j = 0; j < array.length; j++) {
            for (int i = j + 1; i < array[j].length; i++) {
                buffer = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = buffer;


            }
            result.append("\n");
        }


        return result;
    }
}
