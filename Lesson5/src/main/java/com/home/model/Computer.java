package com.home.model;

import java.util.Random;
import java.util.Scanner;

public class Computer {

    String processor;
    int ram;
    String hardDrive;
    int resources;

    public Computer(String processor, int ram, String hardDrive, int resources) {
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.resources = resources;
    }


    public String toString() {
        return "Computer{" +
                "processor: '" + processor + '\'' +
                ", RAM: " + ram +
                ", hard drive: " + hardDrive +
                ", resources: " + resources +
                '}';
    }

    public void on() {

        if (resources > 0) {
            System.out.println("[on]Внимание! Введите 0 или 1");

            int chose;
            Random random = new Random();

            Scanner scanner = new Scanner(System.in);

            do {
                while (!scanner.hasNextInt()) {
                    System.out.println("Это не число!");
                    scanner.next();
                }
                chose = scanner.nextInt();
            }
            while (chose != 0 && chose != 1);


            if (chose == random.nextInt(2)) {
                resources--;
                off();
            } else {
                resources = 0;
            }
        } else {
            System.out.println("Компьютер сгорел!");
        }

    }

    public void off() {

        if (resources > 0) {
            System.out.println("[off]Внимание! Введите 0 или 1");

            int chose;
            Random random = new Random();

            Scanner scanner = new Scanner(System.in);

            do {
                while (!scanner.hasNextInt()) {
                    System.out.println("Это не число!");
                    scanner.next();
                }
                chose = scanner.nextInt();
            }
            while (chose != 0 && chose != 1);

            if (chose == random.nextInt(2)) {
                on();
                resources--;
            } else {
                resources = 0;
            }
        } else {
            System.out.println("Компьютер сгорел!");
        }


    }


}
