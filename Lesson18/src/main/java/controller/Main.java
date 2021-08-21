package controller;

import lombok.SneakyThrows;
import model.Buyer;
import model.Product;
import tasks.first.com.home.utils.InputValidation;
import tasks.first.com.home.utils.Printer;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class Main {
    private static final LinkedList<Buyer> buyers = new LinkedList<>();
    private static final Scanner scanner = new Scanner(System.in);

    @SneakyThrows
    public static void main(String[] args) {
        int chose;
        boolean loop = true;
        Semaphore semaphore = new Semaphore(1, true);

        while (loop) {
            Printer.print("Выберите действие:" +
                    "\n1 -- ввети количество касс" +
                    "\n2 -- ввести количесвто покупателей" +
                    "\n3 -- обслужить всех" +
                    "\n4 -- выход");
            chose = InputValidation.checkInt();
            switch (chose) {
                case 1:
                    semaphore = new Semaphore(InputValidation.checkInt(), true);
                    break;
                case 2:
                    addBuyer(semaphore, InputValidation.checkInt());
                    break;
                case 3:
                    while (buyers.size() != 0) {
                        buyers.remove(0).start();
                        Thread.sleep(10);
                    }
                    break;
                case 4:
                    loop = false;
                    break;
                default:
                    Printer.print("Некорректные данные");
            }
        }
    }

    public static void addBuyer(Semaphore semaphore, int count) {
        for (int i = 0; i < count; i++) {
            Buyer buyer = new Buyer(semaphore, i+1);
            addProduct(buyer);
            buyers.add(buyer);
        }
    }

    public static void addProduct(Buyer buyer) {

        while (true) {
            Printer.print("Покупатель " + buyer.getNumber());
            Printer.print("Выберите действие:\n1 -- ввести название продукта\n2 -- выход");
            int chose = InputValidation.checkInt();
            switch (chose) {
                case 1:
                    buyer.addProduct(new Product(scanner.nextLine()));
                    break;
                case 2:
                    return;
                default:
                    Printer.print("Некорректные данные");
            }
        }
    }
}
