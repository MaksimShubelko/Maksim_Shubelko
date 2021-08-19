package task6.com.home.controller;

import task5.com.home.utils.CheckerOptional;
import task6.com.home.model.Book;
import task6.com.home.model.EmailAddress;
import task6.com.home.model.Reader;
import task6.com.home.service.Library;
import task6.com.home.utils.EmailChecker;
import tasks.first.com.home.utils.InputValidation;
import tasks.first.com.home.utils.Printer;

public class Main {
    private static final Library library = new Library();

    public static void main(String[] args) {
        boolean loop = true;
        int chose;

        while (loop) {
            Printer.print("Выберите действие:" +
                    "\n1 -- добавить книгу" +
                    "\n2 -- добавить читателя" +
                    "\n3 -- получить отсортированный список книг" +
                    "\n4 -- оповестить всех о закрытии библиотеки" +
                    "\n5 -- посмотреть на руках ли книга" +
                    "\n6 -- посмотреть наибольшее число взятых книг" +
                    "\n7 -- оповестить о возврате книг" +
                    "\n8 -- получить ФИО читателей по группам" +
                    "\n9 -- выход");
            chose = InputValidation.checkInt();
            switch (chose) {
                case 1:
                    library.addBookToLibrary(addBook());
                    break;
                case 2:
                    library.addReaderToLibrary(addReader());
                    break;
                case 3:
                    Printer.print(library.takeSortedListOfAllBooks().toString());
                    break;
                case 4:
                    library.libraryClosedMailing();
                    break;
                case 5:
                    Printer.print(Boolean.toString(library.isBorrowedAuthorsBook(enterAuthorName())));
                    break;
                case 6:
                    Printer.print(CheckerOptional.checkOptionalInteger(library.maxCountOfBorrowedBooks()).toString());
                    break;
                case 7:
                    library.sendingMessageReturningBooks();
                    break;
                case 8:
                    Printer.print(library.makeStringOfFullNameFromGroups());
                    break;
                case 9:
                    loop = false;
                    break;
                default:
                    Printer.print("Некорректные данные");
            }
        }
    }

    public static Book addBook() {
        Book book = new Book();
        Printer.print("Введите автора книги:");
        book.setAuthor(InputValidation.checkString());
        Printer.print("Введите название книги:");
        book.setTitle(InputValidation.checkString());
        Printer.print("Введите год издания");
        book.setYearRealise(InputValidation.checkInt());
        return book;
    }

    public static Reader addReader() {
        Reader reader = new Reader();
        Printer.print("Введите ФИО читателя");
        reader.setFullName(InputValidation.checkString());
        Printer.print("Введите email читателя");
        reader.setEmailAddress(new EmailAddress(EmailChecker.checkEmail(InputValidation.checkString())));
        Printer.print("Добавить книги читателю");
        addBookToReader(reader);
        Printer.print("Подтвердить согласие на рассылку");
        reader.setConsentMailingList(InputValidation.checkBoolean());
        return reader;
    }

    public static void addBookToReader(Reader reader) {
        int chose;
        while (true) {
            Printer.print("1 -- добавить книгу\n2 -- выход");
            chose = InputValidation.checkInt();
            switch (chose) {
                case 1:
                    reader.addBookToReader(addBook());
                    break;
                case 2:
                    return;
            }
        }
    }

    public static String enterAuthorName() {
        return InputValidation.checkString();
    }
}
