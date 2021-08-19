package task6.com.home.service;

import task6.com.home.model.Book;
import task6.com.home.model.EmailAddress;
import task6.com.home.model.Reader;
import task6.com.home.utils.BooksYearReleaseComparator;
import task6.com.home.utils.CountOfBorrowedBooksComparator;
import task6.com.home.utils.GroupsReaders;
import task6.com.home.utils.GroupsReadersEmails;

import java.util.*;
import java.util.stream.Collectors;

public class Library {
    private static final ArrayList<Reader> readers = new ArrayList<>();
    private static final ArrayList<Book> books = new ArrayList<>();
    private static final SendingService sendingService = new SendingService();
    private static GroupsReadersEmails groupsReadersEmails = new GroupsReadersEmails();
    private static GroupsReaders groupsReaders = new GroupsReaders();

    public void addBookToLibrary(Book book) {
        books.add(book);
    }

    public void addReaderToLibrary(Reader reader) {
        readers.add(reader);
    }

    public List<Book> takeSortedListOfAllBooks() {
        return books
                .stream()
                .sorted(new BooksYearReleaseComparator())
                .collect(Collectors.toList());
    }

    public void libraryClosedMailing() {
        sendingService.sendEmailMessageToAll(readers
                .stream()
                .map(Reader::getEmailAddress)
                .map(EmailAddress::getEmail)
                .collect(Collectors.toList()));
    }

    public List<EmailAddress> tooMuchBooksGetEmails() {
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

    public GroupsReadersEmails divideEmailIntoGroups() {

        groupsReadersEmails.setOkGroupEmails(readers
                .stream()
                .filter(readers -> readers.getBorrowedBooks().size() == 1)
                .map(Reader::getEmailAddress)
                .collect(Collectors.toList()));
        groupsReadersEmails.setTooMuchGroupEmails(readers
                .stream()
                .filter(readers -> readers.getBorrowedBooks().size() > 1)
                .map(Reader::getEmailAddress)
                .collect(Collectors.toList()));

        return groupsReadersEmails;
    }

    public GroupsReaders getReadersFromGroups() {
        divideEmailIntoGroups();
        groupsReaders.setOkGroupReaders(readers
                .stream()
                .filter(reader -> groupsReadersEmails.getOkGroupEmails().contains(reader.getEmailAddress()))
                .collect(Collectors.toList()));
        groupsReaders.setTooMuchGroupReaders(readers
                .stream()
                .filter(reader -> groupsReadersEmails.getTooMuchGroupEmails().contains(reader.getEmailAddress()))
                .collect(Collectors.toList()));

        return groupsReaders;
    }

    public void sendingMessageReturningBooks() {
        sendingService.sendEmailMessageToGroups(divideEmailIntoGroups());
    }

    public String makeStringOfFullNameFromGroups() {
        getReadersFromGroups();
        StringBuilder result = new StringBuilder();
        result
                .append("Ok: {")
                .append(groupsReaders
                        .getOkGroupReaders()
                        .stream()
                        .filter(Objects::nonNull)
                        .map(Reader::getFullName)
                        .collect(Collectors.joining(", ")));
        result
                .append("}")
                .append("\nTOO_MUCH: {").append(groupsReaders
                .getTooMuchGroupReaders()
                .stream()
                .filter(Objects::nonNull)
                .map(Reader::getFullName)
                .collect(Collectors.joining(", ")));
        result.append("}");

        return result.toString();
    }
}
