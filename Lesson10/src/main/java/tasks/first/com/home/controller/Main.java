package tasks.first.com.home.controller;

import tasks.first.com.home.model.Robot;
import tasks.first.com.home.model.hands.SamsungHand;
import tasks.first.com.home.model.hands.SonyHand;
import tasks.first.com.home.model.hands.ToshibaHand;
import tasks.first.com.home.model.heads.SamsungHead;
import tasks.first.com.home.model.heads.SonyHead;
import tasks.first.com.home.model.heads.ToshibaHead;
import tasks.first.com.home.model.legs.SamsungLeg;
import tasks.first.com.home.model.legs.SonyLeg;
import tasks.first.com.home.model.legs.ToshibaLeg;
import tasks.first.com.home.utils.*;

import java.util.ArrayList;

public class Main {
    private static Fitter fitter = new Fitter();
    private static ArrayList<Robot> robots;
    private static ArrayList<IRobotParts> parts;

    public static void main(String[] args) {
        int chose;

        while (true) {
            System.out.println("Хотите создать робота?\n1 -- да\n2 -- найти самого дорогого\n3 -- дейсвтие\n4 -- выход");
            chose = InputValidation.checkInt();
            switch (chose) {
                case 1:
                    createRobotsParts();
                    break;
                case 2:
                    Printer.print(Seller.findMostExpensive(fitter.getRobots()));
                    break;
                case 3:
                    action();
                    break;
                default:
                    return;
            }
        }
    }

    public static void action() {
        int robotNumber;
        Printer.print("Ведите номер робота");
        robotNumber = InputValidation.checkInt();
        robots = fitter.getRobots();
        if (robotNumber <= robots.size()) {
            robots.get(robotNumber - 1).action(fitter.getParts());
        } else {
            Printer.print("Такого робота нет");
        }

    }

    public static void createRobotsParts() {
        Robot robot = new Robot();
        parts.add(createHand());
        parts.add(createHead());
        parts.add(createLeg());
        robot.setParts(parts);
        fitter.addRobot(robot);
    }

    public static IRobotParts createLeg() {
        double price;
        int chose;
        IRobotParts leg = null;

        while (true) {
            Printer.print("Введите цену ноги");
            price = InputValidation.checkDouble();
            Printer.print("Выберите фирму:\n1 -- Samsung\n2 -- Sony\n3 -- Toshiba");
            chose = InputValidation.checkInt();
            switch (chose) {
                case 1:
                    leg = new SamsungLeg(price);
                    break;
                case 2:
                    leg = new SonyLeg(price);
                    break;
                case 3:
                    leg = new ToshibaLeg(price);
                    break;
                default:
                    Printer.print("Некорректные данные");
                    continue;
            }
            break;
        }
        fitter.addPart((IRobotParts) leg);
        return leg;
    }

    public static IRobotParts createHead() {
        double price;
        int chose;
        IRobotParts head = null;

        while (true) {
            Printer.print("Введите цену головы");
            price = InputValidation.checkDouble();
            Printer.print("Выберите фирму:\n1 -- Samsung\n2 -- Sony\n3 -- Toshiba");
            chose = InputValidation.checkInt();
            switch (chose) {
                case 1:
                    head = new SamsungHead(price);
                    break;
                case 2:
                    head = new SonyHead(price);
                    break;
                case 3:
                    head = new ToshibaHead(price);
                    break;
                default:
                    Printer.print("Некорректные данные");
                    continue;
            }
            break;
        }
        fitter.addPart((IRobotParts) head);
        return head;
    }

    public static IRobotParts createHand() {
        double price;
        int chose;
        IRobotParts hand = null;

        while (true) {
            Printer.print("Введите цену руки");
            price = InputValidation.checkDouble();
            Printer.print("Выберите фирму:\n1 -- Samsung\n2 -- Sony\n3 -- Toshiba");
            chose = InputValidation.checkInt();
            switch (chose) {
                case 1:
                    hand = new SamsungHand(price);
                    break;
                case 2:
                    hand = new SonyHand(price);
                    break;
                case 3:
                    hand = new ToshibaHand(price);
                    break;
                default:
                    Printer.print("Некорректные данные");
                    continue;
            }
            break;
        }
        fitter.addPart((IRobotParts) hand);
        return hand;
    }
}
