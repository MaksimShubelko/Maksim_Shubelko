package task6.com.home.utils;

import java.util.Comparator;

public class CountOfBorrowedBooksComparator implements Comparator<Integer> {
    public int compare(Integer a, Integer b) {

        return a - b;
    }

}
