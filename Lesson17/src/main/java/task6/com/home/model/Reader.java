package task6.com.home.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Reader {
    private String fullName;
    private EmailAddress emailAddress;
    private boolean consentMailingList;
    private List<Book> borrowedBooks = new ArrayList<>();

    public void addBookToReader(Book book) {
        borrowedBooks.add(book);
    }
}
