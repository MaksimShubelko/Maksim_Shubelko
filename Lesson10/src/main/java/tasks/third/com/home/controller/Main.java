package tasks.third.com.home.controller;

import tasks.second.com.home.utils.InputValidation;
import tasks.third.com.home.model.Proton;
import tasks.third.com.home.model.SpaceX;
import tasks.third.com.home.model.Spaceport;
import tasks.third.com.home.utils.IStart;
import tasks.third.com.home.utils.Printer;

public class Main {
    public static void main(String[] args) {
        int chose;
        Spaceport spaceport = new Spaceport();
        IStart rocket;
        while (true) {

            Printer.print("Зпустим ракету?\n1 -- да\n2 -- нет");
            chose = InputValidation.checkInt();
            switch (chose) {
                case 1:
                    rocket = createRocket();
                    spaceport.setRocket(rocket);
                    spaceport.launch();
                    break;
                case 2:
                    return;
                default:
                    Printer.print("Некорректные данные");
            }
        }
    }

    public static IStart createRocket() {
        int chose;
        boolean loop = true;
        IStart rocket = null;

        while (loop) {
            Printer.print("Выберите ракету\n1 -- SpaceX\n2 -- Proton\n3 -- назад");
            chose = InputValidation.checkInt();

            switch (chose) {
                case 1:
                    rocket = new SpaceX();
                    break;
                case 2:
                    rocket = new Proton();
                    break;
                case 3:
                    loop = false;
                    break;
                default:
                    Printer.print("Некорректные данные");
            }
        }
        Printer.print("Ракета выбрана!");
        return rocket;
    }
}
