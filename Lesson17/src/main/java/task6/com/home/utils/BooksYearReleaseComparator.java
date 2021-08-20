package task6.com.home.utils;

import task6.com.home.model.Book;

import java.util.Comparator;

public class BooksYearReleaseComparator implements Comparator<Book> {

        public int compare(Book a, Book b) {

            return a.getYearRealise() - b.getYearRealise();
        }

}
