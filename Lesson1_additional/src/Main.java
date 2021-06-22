import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Введите через пробел целые числа:");
            System.out.println("Количество положительных чисел = " + calculate(read_string()));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static String read_string ()
            throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String numbers = reader.readLine();

        return numbers;
    }

    public static int calculate(String numbers) {

        int count = 0;

        String[] subStr;

        Pattern pattern = Pattern.compile(" ([0-9]+)");
        Matcher matcher = pattern.matcher(numbers);

        while (matcher.find())
            count += 1;

        return count;
    }

}

