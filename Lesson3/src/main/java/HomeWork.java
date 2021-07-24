import java.util.Random;
import java.util.Scanner;

public class HomeWork {

    final static String[] DEVS = {"программист", "программиста", "программистов"};
    final static int MAX_VALUE_OF_PRIME_NUMBER = 1000;

    public static void main(String[] args) {

        printArray();
        System.out.println(operation(1));
        System.out.println(operation(0));
        System.out.println();
        System.out.println(calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 6}));
        System.out.println(calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 9}));
        calculateSumOfDiagonalElements();
        countDevs(103);
        countDevs(11);
        countDevs(13);
        foobar(6);
        foobar(10);
        foobar(15);
        printMatrix();
        printPrimeNumbers();
    }

    private static void printArray() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов одномерного массива:");

        int countOfElements = scanner.nextInt();
        if (countOfElements >= 1) {
            int[] array = new int[countOfElements];

            Random random = new Random();

            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(100);
            }

            for (int i : array) {
                System.out.printf("%d ", i);
            }
        } else {
            System.out.println("Некорректное значение");
        }
        System.out.println("\n");
    }

    public static int operation(int number) {

        if (number > 0) {
            number += 1;
        } else {
            if (number < 0) {
                number -= 2;
            } else {
                number = 10;
            }
        }

        return number;
    }

    public static int calculateCountOfOddElementsInMatrix(int[] ints) {

        int count = 0;

        if (ints.length <= 0) {
            return -1;
        } else {
            for (int anInt : ints) {
                count += anInt % 2 == 1 ? 1 : 0;
            }
        }

        return count;
    }

    public static void countDevs(int count) {

        if (count > 0) {

            if (count % 10 >= 5 || count % 10 == 0 || count / 10 % 10 == 1) {
                System.out.printf("\n%d %s", count, DEVS[2]);
            } else {
                if (count % 10 >= 2) {
                    System.out.printf("\n%d %s", count, DEVS[1]);
                } else {
                    System.out.printf("\n%d %s", count, DEVS[0]);
                }
            }

        } else {
            System.out.println("\nНекорректное значение");
        }

    }

    public static void foobar(int number) {

        System.out.println("\n");
        if (number % 3 == 0) {
            System.out.print("foo");
        }
        if (number % 5 == 0) {
            System.out.print("bar");
        }

    }

    public static void calculateSumOfDiagonalElements() {

        int summary = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведите размерность двумерного квадратного массива: ");

        int sizeOfArray = scanner.nextInt();
        if (sizeOfArray >= 1) {
            int[][] array = new int[sizeOfArray][sizeOfArray];

            Random random = new Random();

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = random.nextInt(100);
                }
            }

            for (int i = 0; i < array.length; i++) {
                summary += array[i][i];
            }

            System.out.println("Сумма элементов на главной диагонали матрицы равна " + summary);
        } else {
            System.out.println("Некорректное значение");
        }

    }

    public static void printMatrix() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\nВведите кол-во строк, а затем столбцов двумерного массива (через пробел): ");

        String sizesOfArray = scanner.nextLine();

        String[] items = sizesOfArray.split(" ");
        int[] countOfRowsAndColumns = new int[items.length];

        for (int i = 0; i < items.length; i++) {
            countOfRowsAndColumns[i] = Integer.parseInt(items[i]);
        }

        if (countOfRowsAndColumns.length == 2 && countOfRowsAndColumns[0] > 0 && countOfRowsAndColumns[1] > 0) {
            int[][] array = new int[countOfRowsAndColumns[0]][countOfRowsAndColumns[1]];

            Random random = new Random();

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = random.nextInt(100);
                }
            }

            for (int[] ints : array) {
                for (int anInt : ints) {
                    if (anInt % 3 == 0) {
                        System.out.printf("%5c", '+');
                    } else {
                        if (anInt % 7 == 0) {
                            System.out.printf("%5c", '-');
                        } else {
                            System.out.printf("%5c", '*');
                        }

                    }
                }
                System.out.println("\n");
            }

        } else {
            System.out.println("Некорректные данные");
        }


    }

    public static void printPrimeNumbers() {

        boolean isPrime;

        for (int i = 2; i <= MAX_VALUE_OF_PRIME_NUMBER; i++) {
            isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + ", ");
            }
        }

    }
}


