import java.util.Random;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        divideAmoeba();
        System.out.println(summ(9, 0));
        printElementsOfArray();
        System.out.println(calculateCountOfDigits());

    }

    //        Задачи:
//         1) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//   сколько амеб будет через 3, 6, 9, 12,..., 24 часа
    public static void divideAmoeba() {
        for (int i = 0, j = 1; i <= 24; i += 3, j *= 2) {
            System.out.println("Через " + i + " часов амёб будет: " + j);
        }
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

    public static void printElementsOfArray() {
        System.out.println("Ваш массив изначально:");

        int[][] array = new int[4][4];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
                System.out.printf("%5d", array[i][j]);
            }
            System.out.println();
        }


        System.out.println("Треугольники, состоящие из элементов массива:");
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
                        System.out.printf("%5d", array[i][j]);
                    } else {
                        System.out.printf("%5s", " ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }


    }

    public static String calculateCountOfDigits() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");

        while (!scanner.hasNextInt()) {
            System.out.println("Это не число!");
            scanner.next();
        }

        int number;
        number = scanner.nextInt();


        String result = "";

        result = result + number;

        if (number > 0) {
            result += " это положительное число, с количеством цифр, равным ";
        } else {
            if (number < 0) {
                result += " это отрицательное число, с количеством цифр, равным ";
            } else {
                result += " это не положительное и не отрицательное число, с количеством цифр, равным ";
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

        result += countOfDigits;

        return result;
    }


}
