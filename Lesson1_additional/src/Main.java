import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Введите через пробел целые числа:");
            System.out.println("Количество положительных чисел = " + Calculator.calculate(Buffered.read_string()));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

class Buffered {
    public static String read_string ()
            throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String numbers = reader.readLine();

        return numbers;
    }

}

class Calculator {

    public static int calculate(String numbers) {

        int count = numbers.charAt(0) == '-' ? 0 : 1;

        for (int i = 1; i < numbers.length(); i++)
            if (numbers.charAt(i) == ' ' && numbers.charAt(i+1) != '-')
                count += 1;

        return count;
    }

}


