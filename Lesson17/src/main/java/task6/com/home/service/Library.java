package task6.com.home.service;

import task6.com.home.model.Book;
import task6.com.home.model.EmailAddress;
import task6.com.home.model.Reader;
import task6.com.home.utils.BooksYearReleaseComparator;
import task6.com.home.utils.CountOfBorrowedBooksComparator;
import task6.com.home.utils.GroupsReadersEmails;
import task6.com.home.utils.GroupsReaders;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Library {
    private static List<Reader> readers;
    private static List<Book> books;
    private static GroupsReadersEmails groupsReadersEmails = new GroupsReadersEmails();


    public List<Book> takeSortedListOfAllBooks() {
        return books
                .stream()
                .sorted(new BooksYearReleaseComparator())
                .collect(Collectors.toList());
    }

    public List<EmailAddress> libraryClosedMailing() {
        return readers
                .stream()
                .map(Reader::getEmailAddress)
                .collect(Collectors.toList());
    }

    public List<EmailAddress> tooMuchBooksMailing() {
        return readers
                .stream()
                .filter(reader -> reader.getBorrowedBooks().size() > 1)
                .map(Reader::getEmailAddress)
                .collect(Collectors.toList());
    }

    public Set<Book> allBorrowedBooks() {
        return readers
                .stream()
                .map(Reader::getBorrowedBooks)
                .flatMap(List::stream)
                .collect(Collectors.toSet());
    }

    public boolean isBorrowedAuthorsBook(String author) {
        return allBorrowedBooks()
                .stream()
                .anyMatch(book -> book.getAuthor().equals(author));
    }

    public Optional<Integer> maxCountOfBorrowedBooks() {
        return readers
                .stream()
                .map(reader -> reader.getBorrowedBooks().size())
                .max(new CountOfBorrowedBooksComparator());
    }

    public GroupsReadersEmails divideIntoGroups() {
        GroupsReadersEmails groupsReadersEmails = new GroupsReadersEmails();

        groupsReadersEmails.setOkGroupEmails(readers
                .stream()
                .filter(readers -> readers.getBorrowedBooks().size() == 1)
                .map(reader -> reader.getEmailAddress())
                .collect(Collectors.toList()));
        groupsReadersEmails.setTooMuchGroupEmails(readers
                .stream()
                .filter(readers -> readers.getBorrowedBooks().size() > 1)
                .map(reader -> reader.getEmailAddress())
                .collect(Collectors.toList()));

        return groupsReadersEmails;
    }

    public String getReadersEmailsFromGroups() {
        GroupsReaders groupsReaders = new GroupsReaders();

        readers
                .stream()
                .filter(reader -> groupsReadersEmails.getOkGroupEmails().contains(reader.getEmailAddress()))
                .forEach(reader -> groupsReaders. );
        readersFromDifferentGroups.setCharAt(readersFromDifferentGroups.length(), '\n');
        readers
                .stream()
                .filter(reader -> groupsReaders.getTooMuchGroup().contains(reader.getEmailAddress()))
                .map(reader -> reader.getFullName())
                .forEach(fullName -> readersFromDifferentGroups
                        .append(fullName)
                        .append(", "));
        readersFromDifferentGroups.setCharAt(readersFromDifferentGroups.length(), '\n');

        return readersFromDifferentGroups.toString();
    }
}
