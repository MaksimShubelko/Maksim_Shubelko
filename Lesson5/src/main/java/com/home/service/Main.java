package com.home.service;

import com.home.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer;
        computer = new Computer("AMD EPYC 7763", 16, "HD251KJ", 2);

        System.out.println(computer);
        computer.on();
    }
}
