package tasks.second.com.home.controller;

import tasks.first.com.home.utils.Printer;
import tasks.second.com.home.clothes.*;
import tasks.second.com.home.model.Person;
import tasks.second.com.home.utils.InputValidation;

public class Main {

    public static void main(String[] args) {
        int chose;
        boolean loop = true;
        Person person = new Person();

        while (loop) {
            Printer.print("Что добавим?\n1 -- создать одежду\n2 -- снять всё\n3 -- надеть всё\n4 -- выход");
            chose = InputValidation.checkInt();
            switch (chose) {
                case 1:
                    createClothes(person);
                    break;
                case 2:
                    person.takeOff();
                    break;
                case 3:
                    person.takeOn();
                    break;
                case 4:
                    loop = false;
                    break;
                default:
                    Printer.print("Некорректные данные");
            }
        }
    }

    public static void createClothes(Person person) {
        int chose;
        boolean loop = true;

        while (loop) {
            Printer.print("Что добавим?\n1 -- куртку\n2 -- обувь\n3 -- штаны\n4 -- выход");
            chose = InputValidation.checkInt();
            switch (chose) {
                case 1:
                    person.setClothes(createJacket());
                    break;
                case 2:
                    person.setClothes(createShoes());
                    break;
                case 3:
                    person.setClothes(createPants());
                    break;
                case 4:
                    loop = false;
                    break;
                default:
                    Printer.print("Некорректные данные");
            }
        }
    }

    public static IClothes createJacket() {
        int chose;
        IClothes jacket = null;

        Printer.print("Выберите фирму:\n1 -- Василёк\n2 -- Купалинка\n3 -- выход");
        chose = InputValidation.checkInt();
        switch (chose) {
            case 1:
                jacket = new CornflowersJacket();
                break;
            case 2:
                jacket = new KupalinkaJacket();
                break;
            case 3:
                break;
            default:
                Printer.print("Некорректные данные");
        }
        return jacket;
    }

    public static IClothes createShoes() {
        int chose;
        IClothes shoes = null;

        Printer.print("Выберите фирму:\n1 -- Василёк\n2 -- Купалинка\n3 -- выход");
        chose = InputValidation.checkInt();
        switch (chose) {
            case 1:
                shoes = new CornflowersShoes();
                break;
            case 2:
                shoes = new KupalinkaShoes();
                break;
            case 3:
                break;
            default:
                Printer.print("Некорректные данные");
        }
        return shoes;
    }

    public static IClothes createPants() {
        int chose;
        IClothes pants = null;

        Printer.print("Выберите фирму:\n1 -- Василёк\n2 -- Купалинка\n3 -- выход");
        chose = InputValidation.checkInt();
        switch (chose) {
            case 1:
                pants = new CornflowersPants();
                break;
            case 2:
                pants = new KupalinkaPants();
                break;
            case 3:
                break;
            default:
                Printer.print("Некорректные данные");
        }
        return pants;
    }
}
