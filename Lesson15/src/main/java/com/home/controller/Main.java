package com.home.controller;

import com.home.utils.ComparatorFieldsPriceMaxMin;
import com.home.utils.ComparatorFieldsPriceMinMax;
import com.home.model.Product;
import com.home.model.Shop;
import com.home.model.Sorter;
import com.home.utils.Printer;
import com.home.utils.TypesSorts;
import tasks.first.com.home.utils.InputValidation;

import java.util.Scanner;

public class Main {
    private static int chose = 0;
    private static Shop shop = new Shop();
    private static Sorter sorter = new Sorter();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean loop = true;
        sorter.setCompares(new ComparatorFieldsPriceMaxMin());
        sorter.setCompares(new ComparatorFieldsPriceMinMax());
        try {
            while (loop) {
                Printer.print("Выберите действие:\n1 -- вывести\n2 -- добавить\n3 -- удалить\n4 -- редактировать");
                chose = InputValidation.checkInt();
                switch (chose) {
                    case 1:
                        Printer.print(shop.get(choseSorting(), sorter));
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

    public static TypesSorts choseSorting() {
        TypesSorts typeSorts = null;
        boolean loop = true;

        while (loop) {
            Printer.print("Выверите сортировку:\n1 -- в порядке добавления (вначале новые, затем старые)\n2 -- по цене (от минимальной до максимальной)\n3 -- по цене (от максимальной до минимальной)");
            chose = InputValidation.checkInt();
            switch (chose) {
                case 1:
                    typeSorts = TypesSorts.CompareAddingNewOld;
                    break;
                case 2:
                    typeSorts = TypesSorts.ComparePriceMinMax;
                    break;
                case 3:
                    typeSorts = TypesSorts.ComparePriceMaxMin;
                    break;
                default:
                    Printer.print("Некорректные данные");
                    continue;
            }
            loop = false;
        }

        return typeSorts;
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
