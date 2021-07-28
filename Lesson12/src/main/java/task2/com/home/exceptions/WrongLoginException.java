package task2.com.home.exceptions;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class WrongLoginException extends Exception {
    public WrongLoginException(String message) {
        super(message);
    }
}
