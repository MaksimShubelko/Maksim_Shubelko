package tasks.first.com.home.utils;

import lombok.Setter;
import tasks.first.com.home.model.Robot;

import java.util.ArrayList;

@Setter
public final class Seller {

    private Seller() {

    }

    public static String findMostExpensive(ArrayList<Robot> robots) {
        double totalPrice = 0;
        Robot mostExpensiveRobot = new Robot();

        for (Robot robot : robots) {
            if (robot.getPrice() > totalPrice) {
                mostExpensiveRobot = robot;
            }
        }
        return mostExpensiveRobot + String.format("\nСтоимость: %f", mostExpensiveRobot.getPrice());
    }
}
