package task1.com.home.model;

import task1.com.home.exceptions.CarCantStart;

public interface ICar {
    boolean start();
    String tryStart() throws CarCantStart;
}
