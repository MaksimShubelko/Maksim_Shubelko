public class Main {
    public static void main(String[] args) {

        int count = 0;

        System.out.println("Введите в командную строку числа: ");

        for (int i = 0; i < args.length; i++) {
            int number = Integer.parseInt(args[i]);

            count += number > 0 ? 1 : 0;


        }

        System.out.println("Количество положительных чисел равно " + count);

    }

}

