package tasks.first.com.home.utils;

import tasks.first.com.home.model.Types;

public interface IRobotsPart {
    double getPrice();

    Types getType();

    int hashCode();

    void action();
}
