package task1.com.home.exceptions;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CarCantStart extends Exception {
    public CarCantStart(String message) {
        super(message);
    }
}
