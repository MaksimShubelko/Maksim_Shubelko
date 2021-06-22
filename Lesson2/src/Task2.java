public class Task2 {

    public static void main(String[] args) {

        System.out.println(sum(100, 200));
        System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
        System.out.println(max(56, 349));
        System.out.println(average(new int[]{0, -2, 3, -1, 5}));
        System.out.println(max(new int[]{1, 2, 3, 4, 5, 100, 99}));
        System.out.println(calculateHypotenuse(3, 4));

    }

    public static int sum(int a, int b) {
        return Integer.MAX_VALUE - a > b ? a + b : -1;
    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }


    public static double average(int[] array) {
        double summary = 0;
        for (int j : array) summary += j;

        return summary / array.length;

    }

    public static int max(int[] array) {
        int max_numb = array[0];
        for (int j : array)
            max_numb = Math.max(j, max_numb);

        return max_numb;
    }

    public  static  double calculateHypotenuse(int a, int b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }


}
