package com.home.controller;

import com.home.utils.*;
import com.home.model.Product;
import com.home.model.Shop;
import com.home.model.Sorter;
import tasks.first.com.home.utils.InputValidation;

import java.util.Scanner;

public class Main {
    private static int chose = 0;
    private static Shop shop = new Shop();
    private static Sorter sorter = new Sorter();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean loop = true;
        try {
            while (loop) {
                Printer.print("Выберите действие:" +
                        "\n1 -- вывести" +
                        "\n2 -- добавить" +
                        "\n3 -- удалить" +
                        "\n4 -- редактировать" +
                        "\n5 -- выход");
                chose = InputValidation.checkInt();
                switch (chose) {
                    case 1:
                        choseSorting();
                        Printer.print(shop.get(sorter));
                        break;
                    case 2:
                        shop.add(addNewProduct());
                        break;
                    case 3:
                        shop.delete(deleteProduct());
                        break;
                    case 4:
                        shop.edit(choseProductToEdit(), addNewProduct());
                        break;
                    case 5:
                        loop = false;
                        break;
                    default:
                        Printer.print("Некорректные данные");
                }
            }
        } catch (Exception e) {
            Printer.print(e.getMessage());
        }
    }

    public static void choseSorting() {
        TypesSorts typeSorts = null;
        boolean loop = true;

        while (loop) {
            Printer.print("Выверите сортировку:" +
                    "\n1 -- в порядке добавления (вначале новые, затем старые)" +
                    "\n2 -- по цене (от минимальной до максимальной)" +
                    "\n3 -- по цене (от максимальной до минимальной)");
            chose = InputValidation.checkInt();
            switch (chose) {
                case 1:
                    sorter.setComparator(new ComparatorFieldsPriceNewOld());
                    break;
                case 2:
                    sorter.setComparator(new ComparatorFieldsPriceMinMax());
                    break;
                case 3:
                    sorter.setComparator(new ComparatorFieldsPriceMaxMin());
                    break;
                default:
                    Printer.print("Некорректные данные");
                    continue;
            }
            loop = false;
        }
    }

    public static Product addNewProduct() {
        int id;
        String name;
        int price;

        Printer.print("Введите id товара");
        id = InputValidation.checkInt();
        Printer.print("Введите название товара");
        name = scanner.nextLine();
        Printer.print("Введите цену товара");
        price = InputValidation.checkInt();

        return new Product(id, name, price);
    }

    public static int deleteProduct() {
        Printer.print("Введите id товара для удаления");
        return InputValidation.checkInt();
    }

    public static int choseProductToEdit() {
        Printer.print("Введите id товара для редактирования");
        return InputValidation.checkInt();
    }
}
